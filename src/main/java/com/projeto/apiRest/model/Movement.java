package com.projeto.apiRest.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable // resolver uma chave compostar
    public  class MovementId implements Serializable{
        private long idMovement;
        private long idUser;

    }
    @Id
    @EmbeddedId // sabe q é o a id composto MovimentId
    private MovementId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Calendar calendar;
}
