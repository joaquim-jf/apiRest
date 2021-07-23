package com.projeto.apiRest.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {
    @Id
    private Long id;
    @ManyToOne
    private  UserCategory userCategory;
    private  String nome;
    @ManyToOne
    private  Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private  WorkingDay workingDay;
    private BigDecimal tolerancia;
    private LocalDateTime iniJornada;
    private LocalDateTime fimJornada;

}
