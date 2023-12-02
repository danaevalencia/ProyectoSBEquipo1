package org.lhdmi.ecommercelhdmi.repository;

import java.util.Optional;


import org.lhdmi.ecommercelhdmi.model.Secciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccionesRepository extends JpaRepository<Secciones, Long>{
      Optional<Secciones> findByNombre(String nombre);

}//intaerface