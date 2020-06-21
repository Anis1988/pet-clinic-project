package com.example.pet.services;

import com.example.pet.model.Owner;

import java.util.List;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
