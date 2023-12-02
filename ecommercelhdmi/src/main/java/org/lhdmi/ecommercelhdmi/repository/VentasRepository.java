package org.lhdmi.ecommercelhdmi.repository;

import java.util.Optional;

import org.lhdmi.ecommercelhdmi.model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Java Persistence Api es JPA es el estandar de java para podernos conectar a bases de datos
//JPA provee todos los findBy___
@Repository
public interface VentasRepository extends JpaRepository<Ventas, Long> {
	Optional<Ventas> findByFolio(String folio);
<<<<<<< HEAD
}//interface
=======
}
>>>>>>> d6f6baa8cc40b565bcf12e565d40a256360e134e
