package com.example.grpcpetclinic.config;

import io.grpc.BindableService;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

	@Bean
	public BindableService protoReflectionService() {
		return ProtoReflectionService.newInstance();
	}

}
