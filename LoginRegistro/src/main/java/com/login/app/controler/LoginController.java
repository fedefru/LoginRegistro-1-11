package com.login.app.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LoginController {
	
	@Autowired
	DummyService service;
	DummyBase base;
	
	  @GetMapping("/login")
	    public String greetingForm(Model model) {
	        model.addAttribute("usuarios", new Usuarios());
	        return "login";
	    }

	    @PostMapping("/login")
	    public String greetingSubmit(@ModelAttribute Usuarios usuarios) {
	    	if (service.getAtribute(usuarios.getUser(), usuarios.getPass())) {
				return "okLogin";
			} else {
				return "error";
			}
	    }

}
