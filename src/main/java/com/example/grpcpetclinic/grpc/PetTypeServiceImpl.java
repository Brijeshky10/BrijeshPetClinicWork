package com.example.grpcpetclinic.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PetTypeServiceImpl extends PetTypeServiceGrpc.PetTypeServiceImplBase {

	@Override
	public void createPetType(PetTypeRequest request, StreamObserver<PetTypeResponse> responseObserver) {
		PetTypeResponse response = PetTypeResponse.newBuilder()
			.setId(1)
			.setName(request.getName())
			.setLength(request.getLength())
			.setWeight(request.getWeight())
			.setTemperament(request.getTemperament())
			.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getPetTypeById(PetTypeByIdRequest request, StreamObserver<PetTypeResponse> responseObserver) {
		// Dummy data - replace with real DB lookup
		PetTypeResponse response = PetTypeResponse.newBuilder()
			.setId(request.getId())
			.setName("Bulldog")
			.setLength(24)
			.setWeight(50.0)
			.setTemperament("Calm")
			.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
