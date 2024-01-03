package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dao.ClientRepository;
import com.example.api.exception.ClientNotFound;
import com.example.api.model.Client;

@RestController
public class ClientController {
	@Autowired
	public ClientRepository clientRepository;
	
	@PostMapping("/Clients")
	public String saveClientDetails(@RequestBody Client client) {
		clientRepository.save(client);
		return "Client saved";
	}
	@GetMapping("/Clients/getAll")
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/getClientByConsumer/{consumer}")
	public List<Client> getClientsByConsumer(@PathVariable String consumer) {
	    List<Client> clients = clientRepository.getConsumerByName(consumer);
	    if (clients.isEmpty()) {
	        throw new ClientNotFound(consumer);
	    }
	    return clients;
	}
}
