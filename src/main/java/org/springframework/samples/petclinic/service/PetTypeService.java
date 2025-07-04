package org.springframework.samples.petclinic.service;

import org.springframework.samples.petclinic.model.MyPetType;
import org.springframework.samples.petclinic.repository.PetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetTypeService {

	private final PetTypeRepository repository;

	public PetTypeService(PetTypeRepository repository) {
		this.repository = repository;
	}

	public Iterable<MyPetType> findAll() {
		return repository.findAll();
	}

	public Optional<MyPetType> findById(Integer id) {
		return repository.findById(id);
	}

	public MyPetType save(MyPetType petType) {
		return repository.save(petType);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}
