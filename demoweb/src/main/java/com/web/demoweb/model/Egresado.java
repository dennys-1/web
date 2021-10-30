package com.web.demoweb.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

@Table(name="Egresado")

public class Egresado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEgresado;
    private BigInteger Dni;
    private String Nombres;
    private String Apellidos;
    private String grados;
    private Date Fecha;
    private String Modalidad;
    private String Instituto;
    
}
