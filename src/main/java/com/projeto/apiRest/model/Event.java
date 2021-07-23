package com.projeto.apiRest.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Event {
@Id
private long id;
private  String nome;
private  String descricao;


}
