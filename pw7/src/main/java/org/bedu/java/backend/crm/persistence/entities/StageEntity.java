package org.bedu.java.backend.crm.persistence.entities;

import lombok.*;

import javax.persistence.*;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 * author Francisco Javier Camas Tec   francisco_camas@hotmail.com
 */
@Getter
@Setter
@AllArgsConstructor
@Table(name = "STAGES")
@Entity
@NoArgsConstructor
public class StageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stage_id", nullable = false)
    private Long stageId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "stage_order", unique = true, nullable = false)
    private Integer stageOrder;
}
