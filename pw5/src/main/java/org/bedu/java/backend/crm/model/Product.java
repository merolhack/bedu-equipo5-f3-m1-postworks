package org.bedu.java.backend.crm.model;


import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * @author Lenin Meza merolhack@gmail.com
 * @author Paulo Zamora pauloizamora@outlook.com
 */
@Data
@Builder
@RequiredArgsConstructor
public class Product {
    @PositiveOrZero(message = "Product ID must be greater than zero.")
    private long id;

    @NotEmpty(message = "Product Name must not be empty.")
    @Size(min = 4, max = 30, message = "Product Name length must be between 4 letters and 30 letters.")
    private String name;

    private String category;

    @DecimalMin(value = "1.00", inclusive = true, message = "Price must be equal or greater than one.")
    private float price;

    @NotEmpty(message = "Register Number must not be empty.")
    @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$")
    private String registerNumber;

    @PastOrPresent(message = "Creation Date must not be greater than today's date.")
    private LocalDate creationDate;
}
