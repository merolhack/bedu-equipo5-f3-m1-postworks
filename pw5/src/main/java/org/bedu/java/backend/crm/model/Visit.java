package org.bedu.java.backend.crm.model;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * @author Paulo Zamora pauloizamora@outlook.com
 */

public class Visit {
    @PositiveOrZero(message = "Visit ID must be greater than zero.")
    private long id;

    @NotNull(message = "Client Visit must not be empty.")
    private Client client;

    @Future(message = "Scheduled Date must be greater than today's date.")
    private LocalDateTime scheduledDate;

    @NotEmpty(message = "Address must not be empty.")
    @Size(min = 10, message = "Address length must be at least 10 letters.")
    private String address;

    @NotEmpty(message = "Visit Reason must not be empty.")
    @Size(min = 15, message = "Visit Reason length must have at least 15 letters.")
    private String reason;

    @NotEmpty(message = "Sales Person name must not be empty.")
    @Size(min = 4, max = 30, message = "Sales Person name length must be between 4 letters and 30 letters.")
    private String salesPerson;
}
