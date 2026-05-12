package com.Juegos.juegos.Repository;

import com.Juegos.juegos.Model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends JpaRepository <Juego, Long> {
    
}
