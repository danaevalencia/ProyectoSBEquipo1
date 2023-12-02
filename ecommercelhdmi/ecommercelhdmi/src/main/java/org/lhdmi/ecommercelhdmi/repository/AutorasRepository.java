package org.lhdmi.ecommercelhdmi.repository;
import java.util.Optional;
import org.lhdmi.ecommercelhdmi.model.Autoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface AutorasRepository extends JpaRepository<Autoras, Long>{
    Optional<Autoras> findByNombre(String nombre);
}//Repository Autoras 
