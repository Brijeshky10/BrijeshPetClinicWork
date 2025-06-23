package org.springframework.samples.petclinic.web;

import org.springframework.samples.petclinic.model.PetType;
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
	public Iterable<PetType> getAll() {
		return service.findAll();
	}

	@PostMapping
	public PetType add(@RequestBody PetType petType) {
		return service.save(petType);
	}

	@GetMapping("/{id}")
	public Optional<PetType> getById(@PathVariable Integer id) {
		return service.findById(id);
	}

}
