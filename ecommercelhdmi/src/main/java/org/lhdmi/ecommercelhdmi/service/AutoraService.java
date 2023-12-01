package org.lhdmi.ecommercelhdmi.service;
import java.util.List;
import java.util.Optional;

import org.lhdmi.ecommercelhdmi.model.Autoras;
import org.lhdmi.ecommercelhdmi.repository.AutorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoraService {
	private final AutorasRepository autorasRepository;
	@Autowired
	
	public AutoraService(AutorasRepository autorasRepository) {
		this.autorasRepository= autorasRepository;
	}//Constructor 
	
	
	
	
	
	
	public List<Autoras> getAllAutoras() {
		//SELECT * FROM productos como en MySQL
		return autorasRepository.findAll();
	}//método getAllAutoras
	
	
	public Autoras getAutoras(long id) {
	return autorasRepository.findById(id).orElseThrow(
			()-> new IllegalArgumentException("La autora con el id ["+id+ " ] no existe")
			);
	}//getAutoras
	

	public Autoras deleteAutoras(long id) {
		Autoras autora=null;
		if (autorasRepository.existsById(id)) {
			autora = autorasRepository.findById(id).get();
			autorasRepository.deleteById(id);
		}//if
		return autora;
	} //deleteAutoras 

	public Autoras addAutoras(Autoras autoras) {
Optional<Autoras> tmpAutora = autorasRepository.findByNombre(autoras.getNombre());
		if (tmpAutora.isEmpty()) {
			return autorasRepository.save(autoras);
		}//if 
		else {
			System.out.println("Ya existe el producto con el nombre [ " + autoras.getNombre() + " ]");
			return null;
		}//else
//		autorasRepository.save(autoras);
//		return autoras;
		
	} //AddAutora 

	
	public Autoras updateAutoras(long id, String nombre, String correo, String descripcion, String redSocial, String telefono) {
		Autoras autora=null;
		if (autorasRepository.existsById(id)) {
			autora = autorasRepository.findById(id).get();

				if(nombre!=null) autora.setNombre(nombre);
				if(correo!=null) autora.setCorreo(correo);
				if(descripcion!=null) autora.setDescripcion(descripcion);
				if(redSocial!=null) autora.setRedSocial(redSocial);
				if(telefono!=null) autora.setTelefono(telefono);
				autorasRepository.save(autora);	
		}//existById
		return autora;
	}

	
}//class AutoraService