/**
 * 
 */
package com.javahash.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author abenabbes
 *
 */
@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET) 
    public String printWelcome(ModelMap model) { 
        model.addAttribute("message", "Hello! This is Spring MVC Web Controller."); 
        return "helloworld"; 
    }  
}
