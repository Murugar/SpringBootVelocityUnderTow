package com.iqmsoft.boot.velocity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iqmsoft.boot.velocity.dto.Person;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {
        return "index";
    }

   
    @RequestMapping(method = RequestMethod.GET, value = "/person")
    public String person(Model model) {
    	Person p = new Person();
    	p.setFirstName("test");
    	p.setLastName("test");
    	
        model.addAttribute(p);
        return "person";
    }
}
