package com.utn.tp1persistencia1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura;

    @Column(name = "numero")
    private int numero;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "descuento")
    private double descuento;

    @Column(name = "forma_pago")
    private String formaPago;

    @Column(name = "total")
    private int total;


}
