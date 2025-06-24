package org.springframework.samples.petclinic.web;

import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.MyPetType;
import org.springframework.samples.petclinic.service.PetTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pettypes")
public class PetTypeController {

	private final PetTypeService service;

	public PetTypeController(PetTypeService service) {
		this.service = service;
	}

	@GetMapping
	public Iterable<MyPetType> getAll() {
		return service.findAll();
	}

	@PostMapping
	public MyPetType add(@RequestBody MyPetType petType) {
		return service.save(petType);
	}

	@GetMapping("/{id}")
	public Optional<MyPetType> getById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePetType(@PathVariable Integer id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
