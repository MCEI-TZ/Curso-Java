package com.spring.SpringSecurityJPA.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "roles")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @NotEmpty
    private String name;

}
