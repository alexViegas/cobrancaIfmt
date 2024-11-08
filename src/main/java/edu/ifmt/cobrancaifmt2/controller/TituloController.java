package edu.ifmt.cobrancaifmt2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TituloController {
	
	@RequestMapping("/titulos/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	

}
