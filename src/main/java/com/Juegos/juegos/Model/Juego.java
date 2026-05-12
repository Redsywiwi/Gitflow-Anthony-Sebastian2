package com.Juegos.juegos.Model;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "juego")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, length = 13, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private Date fecha_publicacion;

    @Column(nullable = false)
    private String desarrollador;

}
