package org.bedu.java.backend.crm.model;


import lombok.*;
import org.bedu.java.backend.crm.persistence.entities.ClientEntity;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Lenin Meza merolhack@gmail.com
 * @author Paulo Zamora pauloizamora@outlook.com
 * @author Francisco Javier Camas Tec  francisco_camas@hotmail.com
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SaleDTO {
    @PositiveOrZero(message = "Sale ID must be greater than zero.")
    private Long saleId;

    @DecimalMin(value = "1.00", inclusive = true, message = "Amount must be equal or greater than {value}.")
    private float amount;

    @NotEmpty(message = "Products Sale must be greater than zero.")
    private List<Product> products;

    @NotNull(message = "Client Sale must not be empty.")
    private ClientEntity client;

    @PastOrPresent(message = "Creation Date must not be greater than today's date.")
    private LocalDateTime creationDate;
}
