package conversion.exception;

import org.springframework.http.HttpStatus;

public class EmployeeException extends RuntimeException {
    private HttpStatus httpStatus;
    private String errorCode;

    private String errorMessage;

    public EmployeeException(HttpStatus httpStatus, String errorCode, String errorMessage) {
        super();
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
