package org.lhdmi.ecommercelhdmi.repository;

import org.lhdmi.ecommercelhdmi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}//interface PRoductoRepository