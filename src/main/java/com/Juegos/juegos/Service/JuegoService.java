package com.Juegos.juegos.Service;


import com.Juegos.juegos.Model.Juego;
import com.Juegos.juegos.Repository.JuegoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JuegoService {
    @Autowired
    private JuegoRepository juegoRepository;

        //para traer los juegos
    public List<Juego> getJuego(){
        return juegoRepository.obtenerJuegos();
    }
}
