package net.itinajero.app.controller;


import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.itinajero.app.model.Pelicula;


@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET )
	public String mostrarPrincipal(Model model ) {
		
		List<Pelicula> peliculas = this.getLista();
		
		
		// peliculas.add("fast and.."); peliculas.add("the ring 2");
		// peliculas.add("Aliens"); peliculas.add("the nun");
		
		
		model.addAttribute("peliculas", peliculas);
		
		return "home";
	}	
	
	@RequestMapping(value="/detail")
	public String mostrarDetalle(Model model) {
		String tituloPelicula = "Fast and Furios";
		int duracion = 136;
		double precioEntrada = 50;
		
		model.addAttribute( "titulo", tituloPelicula );
		model.addAttribute( "ducracion", duracion  );
		model.addAttribute( "precio", precioEntrada );
		
		return "detalle";
	}
	
	private List<Pelicula> getLista() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> list = null;
		
		try {
			
			list = new LinkedList<Pelicula>();
			
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("POwer rangers");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("02-05-2019"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(1);
			pelicula2.setTitulo("Beuty and the Beast");
			pelicula2.setDuracion(140);
			pelicula2.setClasificacion("A");
			pelicula2.setGenero("INfantil");
			pelicula2.setFechaEstreno(formatter.parse("02-05-2019"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(1);
			pelicula3.setTitulo("Against Time");
			pelicula3.setDuracion(106);
			pelicula3.setClasificacion("B");
			pelicula3.setGenero("Tgriller");
			pelicula3.setFechaEstreno(formatter.parse("02-05-2019"));
			
			list.add(pelicula1);
			list.add(pelicula2);
			list.add(pelicula3);
			
			return list;
		} catch(Exception e) {
			System.out.println("error "+ e.getMessage());
			return null;
		}
		
	}
	
}
