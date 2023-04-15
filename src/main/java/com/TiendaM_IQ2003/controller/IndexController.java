package com.TiendaM_IQ2003.controller;

import com.TiendaM_IQ2003.domain.Articulo;
import com.TiendaM_IQ2003.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    ArticuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora desde MVC");
//        log.info("Ahora desde MVC");
//        model.addAttribute("Mensaje","Hola desde el controllador");
//        
//        Articulo articulo = new Articulo("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//        model.addAttribute("objetoArticulo", articulo);
//        
//        Articulo articulo2 = new Articulo("Juan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//        Articulo articulo3 = new Articulo("Pedro", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
//        
//        List<Articulo> articulos = Arrays.asList(articulo,articulo2,articulo3);
        
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);

        return "index";
    }

}
