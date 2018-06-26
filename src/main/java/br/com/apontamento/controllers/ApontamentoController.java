package br.com.apontamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.apontamento.models.Apontamento;

@Controller
@RequestMapping("/")
public class ApontamentoController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listaApontamento() {
		
		
		return new ModelAndView("apontamento/listaApontamento");
	}
	
	@RequestMapping("form")
	public ModelAndView form() {
		
		return new ModelAndView("apontamento/form");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Apontamento apontamento) {
		
		System.out.println(apontamento);
		return new ModelAndView("redirect:/");
	}
	
	
	
}
