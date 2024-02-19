package conversion.constants;


import lombok.Getter;


public enum ErrorCodeEnum {
    GENERIC_EXCEPTION("10001", "Something went wrong, please try again later"),
    EMPLOYEE_ID_ISNULL("1002", "Bad Request, Employee id is null empty"),
    EMPLOYEE_NOT_EXIST("1003", "Bad Request, Employee doesn't exists with this id");

    @Getter
    private String errorCode;

    @Getter
    private String errorMessage;

    private ErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
