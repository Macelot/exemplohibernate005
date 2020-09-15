package org.marcelot;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Clientes, Integer>{
	
	List<Clientes> findByNome(String Nome);
	
	Clientes findClienteById(Integer id);

}
