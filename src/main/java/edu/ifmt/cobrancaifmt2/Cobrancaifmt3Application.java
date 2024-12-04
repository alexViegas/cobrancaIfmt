package edu.ifmt.cobrancaifmt2;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "edu.ifmt.cobrancaifmt2")
@EntityScan(basePackages = "edu.ifmt.cobrancaifmt3.model")

@SpringBootApplication
public class Cobrancaifmt3Application {

	public static void main(String[] args) {
		SpringApplication.run(Cobrancaifmt3Application.class, args);
	}
	


}
