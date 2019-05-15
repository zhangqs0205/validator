import com.sun.org.apache.regexp.internal.recompile;

public class IntSchema extends Schema{
    
    private int max = Integer.MAX_VALUE;
    private int min = Integer.MIN_VALUE;
    public void setMax(int max){
        this.max = max;
    }
    public void setMin(int min){
        this.min = min;
    }
    public boolean validate(Object value,String errMsg){
        if(!(value instanceof Int)){
            errMsg = "value type incompatible";
            return false;
        }
        int intValue = (int)value;
        if(intValue > this.max){
            errMsg = "value if to big";
            return false;
        }

        if(intValue < this.min){
            errMsg = "value is to small";
            return false;
        }

        return true;
    }
}