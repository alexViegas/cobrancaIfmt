
package edu.ifmt.cobrancaifmt2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import edu.ifmt.cobrancaifmt2.Titulos;
import edu.ifmt.cobrancaifmt3.model.StatusTitulo;
import edu.ifmt.cobrancaifmt3.model.Titulo;


@Controller
@RequestMapping("/titulos")
class TituloController {
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		return mv;
	
	}
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
	
	@Autowired
	private Titulos titulos;
	
	@PostMapping
	@Transactional
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView	 salvar(Titulo titulo) {
	    ModelAndView mv = new ModelAndView("CadastroTitulo");
	    mv.addObject("mensagem", "Foi salvo com sucesso!");
	    return mv;
	}
	
	
	

}
