package com.example.grpcpetclinic.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcPetTypeClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
			.usePlaintext() // Use plaintext for local dev; no TLS
			.build();

		PetTypeServiceGrpc.PetTypeServiceBlockingStub stub = PetTypeServiceGrpc.newBlockingStub(channel);

		PetTypeRequest request = PetTypeRequest.newBuilder().build();

		// PetTypeResponse response = stub.getPetType(request);

		PetTypeByIdRequest idRequest = PetTypeByIdRequest.newBuilder().setId(1).build();
		PetTypeResponse response = stub.getPetTypeById(idRequest);

		System.out.println("📦 Received PetType Response:");
		System.out.println("ID: " + response.getId());
		System.out.println("Name: " + response.getName());

		channel.shutdown();
	}

}
