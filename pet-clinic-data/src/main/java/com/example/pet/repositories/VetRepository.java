package com.example.pet.repositories;

import com.example.pet.model.Vet;
import org.springframework.data.repository.CrudRepository;


public interface VetRepository extends CrudRepository<Vet, Long> {
}
