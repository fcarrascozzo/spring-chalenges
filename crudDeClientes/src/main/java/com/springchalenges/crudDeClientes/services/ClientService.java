package com.springchalenges.crudDeClientes.services;

import com.springchalenges.crudDeClientes.dto.ClientDTO;
import com.springchalenges.crudDeClientes.entities.Client;
import com.springchalenges.crudDeClientes.repositories.ClientRepository;
import com.springchalenges.crudDeClientes.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return new ClientDTO(repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum Produto encontrado com o ID informado")));
    }
}
