package com.example.demo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Entidad1;
import com.example.demo.Repositorios.Entidad1_repo;

@Controller
public class Controlador {

    @Autowired
    private Entidad1_repo rp;

    @GetMapping("/CAL_G68")
    public String CAL_G68(){
        return "CAL_G68";
    }
    @GetMapping("index")
    public String index(){
        var ent1=new Entidad1();
        ent1.setId(2);
        ent1.setNombre("juan");
        rp.save(ent1);

        return "index";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/saludo")
	public String saludo(@RequestParam(value = "nombre",required = false, defaultValue = "mundo" ) String nombre, Model model){
		model.addAttribute("name",nombre);
		return "saludo";
	}
    
}
