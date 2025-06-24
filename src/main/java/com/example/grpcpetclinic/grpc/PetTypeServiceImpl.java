package com.example.grpcpetclinic.grpc;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.MyPetType;
import org.springframework.samples.petclinic.service.PetTypeService;

import java.util.Optional;

@GrpcService
public class PetTypeServiceImpl extends PetTypeServiceGrpc.PetTypeServiceImplBase {

	private final PetTypeService petTypeService;

	@Autowired
	public PetTypeServiceImpl(PetTypeService petTypeService) {
		this.petTypeService = petTypeService;
	}

	@Override
	public void createPetType(PetTypeRequest request, StreamObserver<PetTypeResponse> responseObserver) {
		// Convert gRPC request to entity
		MyPetType petType = new MyPetType();
		petType.setName(request.getName());
		petType.setLength(request.getLength());
		petType.setWeight(request.getWeight());
		petType.setTemperament(request.getTemperament());

		// Save to DB
		MyPetType saved = petTypeService.save(petType);

		// Build response
		PetTypeResponse response = PetTypeResponse.newBuilder()
			.setId(Math.toIntExact(saved.getId()))
			.setName(saved.getName())
			.setLength(saved.getLength())
			.setWeight(saved.getWeight())
			.setTemperament(saved.getTemperament())
			.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getPetTypeById(PetTypeByIdRequest request, StreamObserver<PetTypeResponse> responseObserver) {
		Optional<MyPetType> optional = petTypeService.findById(request.getId());

		if (optional.isPresent()) {
			MyPetType petType = optional.get();
			PetTypeResponse response = PetTypeResponse.newBuilder()
				.setId(Math.toIntExact(petType.getId()))
				.setName(petType.getName())
				.setLength(petType.getLength())
				.setWeight(petType.getWeight())
				.setTemperament(petType.getTemperament())
				.build();

			responseObserver.onNext(response);
		}
		else {
			responseObserver
				.onError(Status.NOT_FOUND.withDescription("PetType with ID " + request.getId() + " not found.")
					.asRuntimeException());
		}

		responseObserver.onCompleted();
	}

}
