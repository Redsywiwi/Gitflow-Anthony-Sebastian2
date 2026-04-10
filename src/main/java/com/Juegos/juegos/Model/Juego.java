package com.Juegos.juegos.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@Data
@NoArgsConstructor

public class Juego {
    private int ID;
    private String Nombre; 
    private String Genero;
    private String Fecha_Publicacion;
    private String Desarrollador;
}
