package com.desafiogerenciadorcontas.gerenciadorDeContas.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpClient;
import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class ExceptionHandlerConta {


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> exceptionHandlerCampoInvalido(HttpMessageNotReadableException exception,
                                                                HttpServletRequest request){
        return new ResponseEntity<>("O campo inserido é invalido", HttpStatus.BAD_REQUEST);

    }
    

}
