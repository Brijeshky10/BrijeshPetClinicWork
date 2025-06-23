package org.springframework.samples.petclinic.service;

import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.PetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetTypeService {

	private final PetTypeRepository repository;

	public PetTypeService(PetTypeRepository repository) {
		this.repository = repository;
	}

	public Iterable<PetType> findAll() {
		return repository.findAll();
	}

	public Optional<PetType> findById(Integer id) {
		return repository.findById(id);
	}

	public PetType save(PetType petType) {
		return repository.save(petType);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}
