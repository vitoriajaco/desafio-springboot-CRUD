package com.desafiogerenciadorcontas.gerenciadorDeContas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerConta {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> exceptionHandlerCampoInvalido(HttpMessageNotReadableException exception,
                                                                HttpServletRequest request){
        return new ResponseEntity<>("O campo inserido é invalido", HttpStatus.BAD_REQUEST);

    }
    
}
