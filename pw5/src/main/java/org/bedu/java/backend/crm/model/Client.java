package org.bedu.java.backend.crm.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author Lenin Meza merolhack@gmail.com
 * @author Paulo Zamora pauloizamora@outlook.com
 */

@Data
@Builder
@RequiredArgsConstructor

public class Client {
    @PositiveOrZero(message = "Client ID must be greater than zero.")
    private long id;

    @NotEmpty(message = "Client Name must not be empty.")
    @Size(min = 5, max = 30, message = "Client Name length must be between 5 letters and 30 letters.")
    private String name;

    @Email
    private String contactEmail;

    @Min(value = 10, message = "Clients with less than 10 employees are not valid.")
    @Max(value = 10000, message = "Clients with over 10000 employees are not valid.")
    private String employeesAmount;

    @NotBlank(message = "Address must not be empty.")
    private String address;
}
