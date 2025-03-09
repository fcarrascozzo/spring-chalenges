package com.springchalenges.crudDeClientes.services;

import com.springchalenges.crudDeClientes.dto.ClientDTO;
import com.springchalenges.crudDeClientes.entities.Client;
import com.springchalenges.crudDeClientes.repositories.ClientRepository;
import com.springchalenges.crudDeClientes.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return new ClientDTO(repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum Cliente encontrado com o ID informado")));
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(ClientDTO::new);
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
        Client entity = new Client();

        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setBirthDate(dto.getBirthDate());
        entity.setIncome(dto.getIncome());
        entity.setChildren(dto.getChildren());

        return new ClientDTO(repository.save(entity));
    }
}
