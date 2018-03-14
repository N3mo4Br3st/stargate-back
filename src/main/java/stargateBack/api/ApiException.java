package stargateBack.api;

@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
