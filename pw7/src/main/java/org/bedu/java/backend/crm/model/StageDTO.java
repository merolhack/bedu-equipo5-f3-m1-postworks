package org.bedu.java.backend.crm.model;


import lombok.*;

import javax.validation.constraints.*;

/**
 * @author Paulo Zamora                 pauloizamora@outlook.com
 * @author Francisco Javier Camas Tec   francisco_camas@hotmail.com
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class StageDTO {
    @PositiveOrZero(message = "Stage ID must be greater than zero.")
    private Long stageId;

    @NotEmpty(message = "Stage Name must not be empty.")
    @Size(min = 4, max = 30, message = "Stage Name length must be between {min} letters and {max} letters.")
    private String name;

    @Positive(message = "Order must be greater than zero.")
    private Integer stageOrder;
}
