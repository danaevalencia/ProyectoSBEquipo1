package org.lhdmi.ecommerce.misb.repository;

import java.util.Optional;

import org.lhdmi.ecommerce.misb.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	Optional<Producto> findByTitulo(String titulo);
}//interface PRoductoRepository