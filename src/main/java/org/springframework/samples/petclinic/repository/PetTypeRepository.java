package org.springframework.samples.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.MyPetType;

public interface PetTypeRepository extends CrudRepository<MyPetType, Integer> {

}