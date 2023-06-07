package org.bedu.java.backend.crm.model;


import javax.validation.constraints.*;

/**
 * @author Paulo Zamora pauloizamora@outlook.com
 */

public class Stage {
    @PositiveOrZero(message = "Stage ID must be greater than zero.")
    private long stageId;

    @NotEmpty(message = "Stage Name must not be empty.")
    @Size(min = 4, max = 30, message = "Stage Name length must be between 4 letters and 30 letters.")
    private String name;

    @Positive(message = "Order must be greater than zero.")
    private int order;
}
