package org.lhdmi.ecommercelhdmi.service;

import java.util.ArrayList;

import org.lhdmi.ecommercelhdmi.model.Autoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoraService {
	public final ArrayList<Autoras> lista = new ArrayList<Autoras>();

	@Autowired
	public AutoraService() {
		lista.add(new Autoras(
				"Andrea Villalón",
				"andreavilllalon@gmail.com",
				"Residente de la CDMX, creadora de pinturas al óleo basadas principalmente en su sentir y la naturaleza", 
				"@andreavilllalon",
				"5521142030"
				));

				lista.add(new Autoras(
				"María Fragoso",
				"mariafragosoj@gmail.com",
				"Residente de la CDMX, creadora de pinturas basadas principalmente en desnudos renacentistas y surrealismos Mexicanos", 
				"@mariafragosoj",
				"5521892030"
				));

				lista.add (new Autoras( 
				"Pía Camil",
				"piacamil@gmail.com", 
				"Trabaja desde el Edo. México y CDMX, creadora de pinturas basadas principalmente en los contextos rural/urbano con un diálogo formal y que enfatizan la importancia de la colectividad", 
				"@piacamil", 
				"5552830030"
				));

				lista.add(new Autoras(
				"Karen Reyes",
				"karen_reyes@gmail.com",
				"Trabaja desde San Pedro Garza García, Nuevo León. Su trabajo se basa en pinturas, fotografía y collages, siempre desde lo humano y las relaciones sociales de su entorno.", 
				"@karenreyesssss",
				"5587624489"
				));

				lista.add(new Autoras(
				"Michelle Galavíz",
				"dmich_elle@gmail.com",
				"Residente en el Edo de Durango, su trabajo de pinturas al óleo aboca al realismo y la vida cotidiana que hay en su contexto.", 
				"@dmich.elle",
				"4278662189"
				));
	}//lista
	
	public Autoras getAutoras(long id) {
		Autoras autora=null;
		for (Autoras autoras : lista) {
			if(id==autoras.getId()) {
				autora=autoras;
				break;
			}
		}//forEach
		return autora;
	}//getProducto

	public Autoras deleteAutoras(long id) {
		Autoras autora=null;
		for (Autoras autoras : lista) {
			if(id==autoras.getId()) {
				autora=autoras;
				lista.remove(autoras);
				break;
			}
		}//foEach
		return autora;
	}

	public Autoras addAutoras(Autoras autoras) {
		lista.add(autoras);
		return autoras;
	}

	
	public Autoras updateAutoras(long id, String nombre, String correo, String descripcion, String redSocial, String telefono) {
		Autoras autora=null;
		for (Autoras autoras : lista) {
			if(id==autoras.getId()) {
				if(nombre!=null)autoras.setNombre(nombre);
				if(correo!=null)autoras.setCorreo(correo);
				if(descripcion!=null)autoras.setDescripcion(descripcion);
				if(redSocial!=null)autoras.setRedSocial(redSocial);
				if(telefono!=null)autoras.setTelefono(telefono);
				autora=autoras;
				break;
			}//if
		}//forEach
		return autora;
	}

	public ArrayList<Autoras> getAllAutoras() {
		return lista;
	}//getAllAutoras
	
}//class AutoraService