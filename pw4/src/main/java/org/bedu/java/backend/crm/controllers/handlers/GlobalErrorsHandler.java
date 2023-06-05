package org.bedu.java.backend.crm.controllers.handlers;

import org.bedu.java.backend.crm.model.ErrorMessage;
import org.bedu.java.backend.crm.model.ResponseError;
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

        return ResponseError.builder()
                .exception(ex)
                .message("An error occurred while validating the request information.")
                .route(request.getDescription(false).substring(4))
                .entity();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> manejaException(Exception ex, WebRequest request) {
        return ResponseError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message("An error occurred while processing the request")
                .route(request.getDescription(false).substring(4))
                .entity();
    }
}
