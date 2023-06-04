package org.bedu.java.backend.crm.model.builders;

import org.bedu.java.backend.crm.model.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Paulo Zamora pauloizamora@outlook.com
 */

public class ErrorMessageBuilder {
    private int status;
    private String message1;
    private Map<String, String> errors;
    private String path;

    public ErrorMessageBuilder status(int status) {
        this.status = status;
        return this;
    }

    public ErrorMessageBuilder status(HttpStatus status) {
        this.status = status.value();

        if (status.isError()) {
            this.errors.put("error", status.getReasonPhrase());
        }

        return this;
    }

    public ErrorMessageBuilder errors(Map<String, String> error) {
        this.errors = errors;
        return this;
    }

    public ErrorMessageBuilder message(String message) {
        this.message1 = message;
        return this;
    }
    public ErrorMessageBuilder exception(MethodArgumentNotValidException exception) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        this.status = status.value();

        errors = new HashMap<>();

        exception.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return this;
    }

    public ErrorMessageBuilder path(String path) {
        this.path = path;
        return this;
    }

    public ErrorMessage build() {
        ErrorMessage message = new ErrorMessage();
        message.setStatus(status);
        message.setMessage(message1);
        message.setErrors(errors);
        message.setPath(path);
        return message;
    }

    public ResponseEntity<ErrorMessage> entidad() {
        return ResponseEntity.status(status).headers(HttpHeaders.EMPTY).body(build());
    }
}
