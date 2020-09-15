package org.marcelot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
public class ClienteContoller {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/find/{id}")
	public Clientes findClienteById(@PathVariable Integer id) {
		return clienteRepository.findClienteById(id);
	}
	
	@GetMapping("/list")
	public Iterable<Clientes> getClientes() {
		return clienteRepository.findAll();
	}
	
	@PostMapping ("/add")
	public String addCliente(@RequestParam String nome, @RequestParam String email, @RequestParam Float salario, @RequestParam String senha) {
		Clientes cliente = new Clientes();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		cliente.setSalario(salario);
		cliente.setDataCadastro(new Date());
		cliente.setDataAlteracao(new Date());
		cliente.setVersao(1);
		clienteRepository.save(cliente);
		return "Novo usuário adicionado";
	}
}