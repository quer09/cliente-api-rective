package com.demo.cliente.api.reactive.repository;

import com.demo.cliente.api.reactive.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, Integer> {
}
