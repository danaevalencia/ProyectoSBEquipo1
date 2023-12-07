package org.lhdmi.ecommerce.misb.repository;

import java.util.Optional;
import org.lhdmi.ecommerce.misb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
      Optional<Usuario> findByNombre(String nombre);
      Optional<Usuario> findByCorreo(String correo);
}//interface