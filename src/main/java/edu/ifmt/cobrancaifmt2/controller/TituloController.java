package edu.ifmt.cobrancaifmt2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ifmt.cobrancaifmt2.Titulos;
import edu.ifmt.cobrancaifmt3.model.Titulo;


@Controller
@RequestMapping("/titulos")
class TituloController {
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	@Autowired
	private Titulos titulos;
	
	@PostMapping
	@Transactional
	public String salvar(Titulo titulo) {
	    System.out.println("Tentando salvar: " + titulo);
	    titulos.save(titulo);
	    System.out.println("Salvou com sucesso!");
	    return "redirect:/titulos/novo";
	}
	
	
	

}
