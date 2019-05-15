public class Validator{
    public static boolean validate(Schema schema,Object value,String errorMsg) {
        return schema.validate(value, errMsg);
    }
}