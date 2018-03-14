package stargateBack.api;

@javax.annotation.Generated(value = "stargateBack.codegen.languages.SpringCodegen", date = "2018-01-17T12:31:05.539Z")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
