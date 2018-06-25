package br.com.apontamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ApontamentoController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaApontamento() {
		
		
		return new ModelAndView("listaApontamento");
	}
	
	
	
	
	
}
