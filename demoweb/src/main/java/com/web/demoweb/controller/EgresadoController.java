package com.web.demoweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.web.demoweb.model.Egresado;

import com.web.demoweb.repository.EgresadoRepository;


import javax.validation.Valid;

@Controller
public class EgresadoController {
    
    private static final String INDEX ="Egresado/registro"; 
    private static String MODEL_EGRESADO="Egresad";
    private final EgresadoRepository egresdoData;

    public EgresadoController(EgresadoRepository egresdoData){
        this.egresdoData = egresdoData;
        
    }      
    
     @GetMapping("/Egresado/registro")
    public String create(Model model) {
        model.addAttribute(MODEL_EGRESADO, new Egresado());
        return INDEX;
    }    

    @PostMapping("/Egresado/registro")
    public String createSubmitForm(Model model, 
        @Valid Egresado objEgresado, BindingResult result ){
        if(result.hasFieldErrors()) {
            model.addAttribute("mensaje", "No se registro ");
        }else{
            
            this.egresdoData.save(objEgresado);
            model.addAttribute(MODEL_EGRESADO, objEgresado);
            model.addAttribute("mensaje", "Se registro ");
        }
        return INDEX;
    }

}