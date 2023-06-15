package org.bedu.java.backend.crm.model;

import lombok.*;

import javax.validation.constraints.*;

/**
 * @author Lenin Meza                 merolhack@gmail.com
 * @author Paulo Zamora               pauloizamora@outlook.com
 * @author Francisco Javier Camas Tec francisco_camas@chotmail.com
 */

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientDTO {
    @PositiveOrZero(message = "Client ID must be greater than zero.")
    private long id;

    @NotEmpty(message = "Client Name must not be empty.")
    @Size(min = 5, max = 30, message = "Client Name length must be between {min} letters and {max} letters.")
    private String name;

    @Email
    private String contactEmail;

    @Min(value = 10,    message = "Clients with less than {value} employees are not valid.")
    @Max(value = 10000, message = "Clients with over {value} employees are not valid.")
    private String employeesAmount;

    @NotBlank(message = "Address must not be empty.")
    private String address;
}
