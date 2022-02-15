package com.ishmamruhan.Liv2Train.ExceptionManagement.HandleControllers;

import com.ishmamruhan.Liv2Train.ExceptionManagement.CustomException.TrainingCenterException;
import com.ishmamruhan.Liv2Train.ExceptionManagement.Templates.ErrorBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class TrainingCenterControllerException extends ResponseEntityExceptionHandler {

    /**
     *
     * The following method will handle the errors caused by Entity validation.
     * If any entity is not valid, the following method will catch the error and show as output
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        HashMap<String,String> errors =new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error -> {


            String field = "Error Case  # "+((FieldError) error).getField();
            String message = error.getDefaultMessage();

            errors.put(field,message);

        }));

        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }


    /**
     *
     * The following method is our custom Exception handler method. If any error occurs in Training Center Service
     * The following method will catch that with message. and finally shows that.
     */

    @ExceptionHandler(TrainingCenterException.class)
    public ResponseEntity<ErrorBody> customError(TrainingCenterException ex){
        ErrorBody error=new ErrorBody(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()),ex.getMessage());

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
