package marcoantn020.cleanarch.entrypoint.controller;

import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandleController {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<Error> handleFeignException() {
        return ResponseEntity.badRequest().body(new Error("zipcode not found"));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Error> handleRuntimeException(RuntimeException exception) {
        return ResponseEntity.badRequest().body(new Error(exception.getMessage()));
    }


    public record Error(String error){}
}
