package org.marcelot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
        
    }
    
    
    @Bean
    public CommandLineRunner exemplohibernate005(final ClienteRepository repository) {
    	return (args) -> {
		    // save a few customers
    		Date cadastro = new Date();
    		Date altaracao = new Date();
		    repository.save(new Clientes(1,cadastro,altaracao,"Jack"));
		    repository.save(new Clientes(1,cadastro,altaracao,"Chloe"));
		    repository.save(new Clientes(1,cadastro,altaracao,"Kim"));
		    repository.save(new Clientes(1,cadastro,altaracao,"David"));
		    repository.save(new Clientes(1,cadastro,altaracao,"Michelle"));
		 
		    // fetch all customers
		    log.info("Customers found with findAll():");
		    log.info("-------------------------------");
		    for (Clientes cli : repository.findAll()) {
		    	log.info(cli.toString());
		    }
		    log.info("");
		    // fetch an individual customer by ID
		    Clientes cli = repository.findClienteById(2);
		    log.info("Customer found with findById(2):");
		    log.info("--------------------------------");
		    log.info(cli.toString());
		    log.info("");
		    
		    // fetch customers by last name
		    log.info("Customer found with findByLastName('Jack'):");
		    log.info("--------------------------------------------");
		    //repository.findByName("Jack").forEach(Jack -> {
		    // log.info(Jack.toString());
		    //});
		    for (Clientes Jack : repository.findByNome("Jack")) {
		    	log.info(Jack.toString());
		    }
		    log.info("");
    	};
    }   
}
