package com.Juegos.juegos.Service;
import com.Juegos.juegos.Model.Juego;
import com.Juegos.juegos.Repository.JuegoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    public List<Juego> findAll(){
        return juegoRepository.findAll();
    }

    public Juego findById(long id){
        return juegoRepository.findById(id).get();
    }

    public Juego save(Juego juego){
        return juegoRepository.save(juego);
    }

    public void delete(long id){
        juegoRepository.deleteById(id);
    }
}
