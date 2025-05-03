package com.senai.aula.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<Map<String, Object>> handlerIllegalArgumentException (IllegalAccessException erro){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handlerIllegalArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getFieldErrors()
                        .get(0)
                        .getDefaultMessage()));
    }
}
