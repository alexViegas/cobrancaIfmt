package edu.ifmt.cobrancaifmt2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ifmt.cobrancaifmt3.model.Titulo;

@Repository
public interface Titulos extends JpaRepository<Titulo, Long>{
	

}