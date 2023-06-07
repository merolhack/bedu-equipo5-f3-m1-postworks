package org.bedu.java.backend.crm.controllers.handlers;

import org.bedu.java.backend.crm.model.ResponseError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.util.TreeMap;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, String> errors = new TreeMap<>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }
        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            errors.put(error.getObjectName(), error.getDefaultMessage());
        }
        ResponseError rsponseError = new ResponseError();
        rsponseError.setMistakes(errors);
        rsponseError.setRoute(request.getDescription(false).substring(4));
        return handleExceptionInternal(
                ex, rsponseError, headers, HttpStatus.BAD_REQUEST, request);
    }
    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        Map<String, String> errors = new TreeMap<>();

        StringBuilder builder = new StringBuilder();
        builder.append("This metod");
        builder.append(ex.getMethod());
        builder.append(" is not supported for this request. Supported methods are ");

        ex.getSupportedHttpMethods().forEach(t -> builder.append(t + " "));

        errors.put("Error", builder.toString());
        ResponseError responseError = new ResponseError();
        responseError.setMistakes(errors);
        responseError.setRoute(request.getDescription(false).substring(4));

        return new ResponseEntity<Object>(responseError, new HttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
    }
}
