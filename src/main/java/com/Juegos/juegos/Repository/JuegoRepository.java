package com.Juegos.juegos.Repository;
import com.Juegos.juegos.Model.Juego;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class JuegoRepository {
    //se crea la lista que guarda los juegos
    private List<Juego> listaJuegos = new ArrayList<>();


    //la poblacion
    public JuegoRepository(){
        listaJuegos.add(new Juego(1, "Kenshi",  "Sandbox - Rol",  "6 Diciembre 2018",  "Lo-Fi Games"));
        listaJuegos.add(new Juego(2, "Risk of Rain 2", "Rougelite - Third Person Shooter", "11 Agosto 2020", "Hopoo Games" ));
        listaJuegos.add(new Juego(3, "Balatro",  "Cartas - Rougelike",  "20 Febrero 2024",  "LocalThunk"));
        listaJuegos.add(new Juego(4, "Peak", "Cooperativo en linea - Aventura", "16 Junio 2025", "Landfall - Aggro crab" ));    
        listaJuegos.add(new Juego(5, "Payday 2",  "First Person Shooter",  "13 Agosto 2013",  "Overkill Studio"));
        listaJuegos.add(new Juego(6, "Counter Strike 2", "First Person Shooter - Multijugador", "21 Agosto 2012", "Valve" ));
        listaJuegos.add(new Juego(7, "Stardew Valley",  "Granjas - Casual",  "26 Febrero 2016",  "ConcernedApe"));
        listaJuegos.add(new Juego(8, "Tom Clancy's Rainbow Six Siege", "First Person Shooter - Multijugador", "1 Diciembre 2015", "Ubisoft" ));   
        listaJuegos.add(new Juego(9, "Ratatan",  "Ritmo",  "18 Septiembre 2025",  "TVT Co - Ratata Arts"));
        listaJuegos.add(new Juego(10, "battlefield 6", "Accion - Multijugador", "10 Octubre 2025", "Electronic Arts" )); 
    }

    //Pa traer los juegos
    public List<Juego> obtenerJuegos(){
        return listaJuegos;
    }
}
