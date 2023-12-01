package org.lhdmi.ecommercelhdmi.repository;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> mfal
import org.lhdmi.ecommercelhdmi.model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Java Persistence Api es JPA es el estandar de java para podernos conectar a bases de datos
//JPA provee todos los findBy___
@Repository
public interface VentasRepository extends JpaRepository<Ventas, Long> {
<<<<<<< HEAD
=======
	Optional<Ventas> findByFolio(String folio);
>>>>>>> mfal
}
