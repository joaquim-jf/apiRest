package com.projeto.apiRest.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Calendar {
    @Id
    private Long id;
    @ManyToOne
    private TypeData typeData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
