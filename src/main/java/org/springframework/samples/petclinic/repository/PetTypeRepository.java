package org.springframework.samples.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Integer> {

}