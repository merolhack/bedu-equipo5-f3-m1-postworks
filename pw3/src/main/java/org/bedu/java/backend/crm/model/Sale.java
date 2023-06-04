package org.bedu.java.backend.crm.model;


import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Paulo Zamora pauloizamora@outlook.com
 */

public class Sale {
    @PositiveOrZero(message = "Sale ID must be greater than zero.")
    private long saleId;

    @DecimalMin(value = "1.00", inclusive = true, message = "Amount must be equal or greater than one.")
    private float amount;

    @NotEmpty(message = "Products Sale must be greater than zero.")
    private List<Product> products;

    @NotNull(message = "Client Sale must not be empty.")
    private Client client;

    @PastOrPresent(message = "Creation Date must not be greater than today's date.")
    private LocalDate creationDate;
}
