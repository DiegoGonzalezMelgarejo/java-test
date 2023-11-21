package com.test.diego.insfrastructure.adapter.in.rest.advice;

import com.test.diego.application.exception.ClientNotFountException;
import com.test.diego.insfrastructure.adapter.in.rest.advice.dto.MessageAdviceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
@RestControllerAdvice
public class AdviceController {
    private static final Map<Class<? extends Exception>, HttpStatus> RESPONSE_HTTP = new HashMap<>();
    private static final String MESSAGE_INVALID="You're sending a predefined value incorrectly.";

    public AdviceController() {
        RESPONSE_HTTP.put(ClientNotFountException.class,HttpStatus.NOT_FOUND);
        RESPONSE_HTTP.put(MethodArgumentNotValidException.class, HttpStatus.BAD_REQUEST);
        RESPONSE_HTTP.put(HttpMessageNotReadableException.class, HttpStatus.NOT_FOUND);
        RESPONSE_HTTP.put(Exception.class, HttpStatus.INTERNAL_SERVER_ERROR);

    }
    @ExceptionHandler(ClientNotFountException.class)
    public ResponseEntity<MessageAdviceDto> handleClientNotFound(ClientNotFountException exception){
        return ResponseEntity.status(RESPONSE_HTTP.get(ClientNotFountException.class)).body(MessageAdviceDto.builder().message(exception.getMessage()).build());
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<MessageAdviceDto> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception){
        return ResponseEntity.status(RESPONSE_HTTP.get(HttpMessageNotReadableException.class)).body(MessageAdviceDto.builder().message(MESSAGE_INVALID).build());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {

            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<MessageAdviceDto> handleInternalServerError(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(MessageAdviceDto.builder().message("Service not available, contact administrator: " + exception.getMessage()).build());
    }
}
