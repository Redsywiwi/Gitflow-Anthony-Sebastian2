package com.Juegos.juegos.Controller;
import com.Juegos.juegos.Model.Juego;
import com.Juegos.juegos.Service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/juegos")
public class JuegoController {
    @Autowired
    private JuegoService juegoService;
    
    @GetMapping
    public List<Juego> listaJuegos(){
        return juegoService.getJuego();
    }

}
