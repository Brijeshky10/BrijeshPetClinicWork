package com.example.grpcpetclinic.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PetTypeServiceImpl extends PetTypeServiceGrpc.PetTypeServiceImplBase {

	@Override
	public void createPetType(PetTypeRequest request, StreamObserver<PetTypeResponse> responseObserver) {
		PetTypeResponse response = PetTypeResponse.newBuilder()
			.setId(1L) // dummy ID for example
			.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
