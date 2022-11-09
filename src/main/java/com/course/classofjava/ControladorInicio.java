
package com.course.classofjava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j

public class ControladorInicio {
    @Value("${index.saludo}")
    private String  saludo;
    @GetMapping("/")
    public String Inicio(Model model){
        var mensaje = "Hola Mundo con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Mizael");
        persona.setApellido("Morales");
        persona.setEmail("miza@gmail.com");
        persona.setTelefono("5544885");
       
        var persona2 = new Persona();
        persona2.setNombre("Luhen");
        persona2.setApellido("Gomex");
        persona2.setEmail("Luhen@gmail.com");
        persona2.setTelefono("43242423");

        //List<Persona> personas  = new ArrayList();
        //var personas = new ArrayList();
        //personas.add(persona);
        //personas.add(persona2);

        var personas = Arrays.asList(persona,persona2);
        //System.out.println(personas);
        log.info("Ejecutando el controlador MVC");
        model.addAttribute("mensaje", mensaje);
        //model.addAttribute("persona", persona);
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    } 
}
