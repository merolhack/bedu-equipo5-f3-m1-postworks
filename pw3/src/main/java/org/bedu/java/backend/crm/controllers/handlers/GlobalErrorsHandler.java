package org.bedu.java.backend.crm.controllers.handlers;

import org.bedu.java.backend.crm.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Paulo Zamora pauloizamora@outlook.com
 */

@RestControllerAdvice
public class GlobalErrorsHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleStatusException(MethodArgumentNotValidException ex, WebRequest request) {

        return ErrorMessage.builder()
                .exception(ex)
                .message("There was an error validating the request information.")
                .path(request.getDescription(false).substring(4))
                .entidad();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex, WebRequest request) {
        return ErrorMessage.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message("There was an error processing the request.")
                .path(request.getDescription(false).substring(4))
                .entidad();
    }
}
