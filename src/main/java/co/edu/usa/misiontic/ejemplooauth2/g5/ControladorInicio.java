/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.ejemplooauth2.g5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jarri
 */
@Controller
public class ControladorInicio {
    
    @GetMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "inicio";
    }
    
}
