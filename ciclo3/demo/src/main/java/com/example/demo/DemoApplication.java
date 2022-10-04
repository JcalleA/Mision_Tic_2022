package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Entidad1;
import com.example.demo.Repositorios.Entidad1_repo;


@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Autowired
	private Entidad1_repo rp;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/todo")
	public List<Entidad1> hola(@RequestParam(value = "name",defaultValue = "Mundo") String name){
		return rp.findAll();
	}

	@GetMapping("/consulta")
	public Optional<Entidad1> consulta(@RequestParam(value = "id",defaultValue = "1") int id){
		return rp.findById(id);
	}

	@GetMapping("/borrar")
	public void borrar(@RequestParam(value = "id",defaultValue = "1") int id){
		rp.deleteById(id);
		
	}

	@GetMapping("/agregar")
	public List<Entidad1> agregar(@RequestParam(value = "nombre",defaultValue = "aaa") String nombre){
		var ent= new Entidad1();
		ent.setNombre(nombre);
		rp.save(ent);
		
		return rp.findAll();
	}

	
	
}



