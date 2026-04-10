package com.Juegos.juegos.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data

public class Juego {
    private String Nombre; 
    private String Genero;
    private int Año;
    private String Desarrollador;
}
