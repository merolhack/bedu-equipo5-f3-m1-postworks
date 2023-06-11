package org.bedu.java.backend.crm.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Data
@Table(name = "STAGES")
@Entity
@NoArgsConstructor
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stageId;

    private String name;

    @Column(unique = true, nullable = false)
    private Integer stageOrder;
}
