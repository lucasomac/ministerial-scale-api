package br.com.lucolimac.ministerialscaleapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@ControllerAdvice(basePackages = "br.com.lucolimac.ministerialscaleapi.controller")
public class ScaleControllerAdvice {
    @ResponseBody
    @ExceptionHandler(ScaleNotFoundException.class)
    public ResponseEntity<MessageExceptionHandler> scaleNotFound() {
        MessageExceptionHandler error = new MessageExceptionHandler(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "Escala não encontrada!");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
