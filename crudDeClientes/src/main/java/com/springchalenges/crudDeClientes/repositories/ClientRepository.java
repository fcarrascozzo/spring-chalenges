package com.springchalenges.crudDeClientes.repositories;

import com.springchalenges.crudDeClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
