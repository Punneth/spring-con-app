package conversion.exception;

import conversion.constants.ErrorCodeEnum;
import conversion.constants.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<ErrorResponse> handleOrderServiceException(EmployeeException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder().errorCode(ex.getErrorCode())
                .errorMessage(ex.getErrorMessage()).build();
        return new ResponseEntity<>(errorResponse, ex.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse errorResponse = ErrorResponse.builder().errorCode(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorCode())
                .errorMessage(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorMessage()).build();
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

