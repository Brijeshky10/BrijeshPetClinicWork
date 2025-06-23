package com.example.grpcpetclinic.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: pet_type.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PetTypeServiceGrpc {

  private PetTypeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "PetTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpcpetclinic.grpc.PetTypeRequest,
      com.example.grpcpetclinic.grpc.PetTypeResponse> getCreatePetTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePetType",
      requestType = com.example.grpcpetclinic.grpc.PetTypeRequest.class,
      responseType = com.example.grpcpetclinic.grpc.PetTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpcpetclinic.grpc.PetTypeRequest,
      com.example.grpcpetclinic.grpc.PetTypeResponse> getCreatePetTypeMethod() {
    io.grpc.MethodDescriptor<com.example.grpcpetclinic.grpc.PetTypeRequest, com.example.grpcpetclinic.grpc.PetTypeResponse> getCreatePetTypeMethod;
    if ((getCreatePetTypeMethod = PetTypeServiceGrpc.getCreatePetTypeMethod) == null) {
      synchronized (PetTypeServiceGrpc.class) {
        if ((getCreatePetTypeMethod = PetTypeServiceGrpc.getCreatePetTypeMethod) == null) {
          PetTypeServiceGrpc.getCreatePetTypeMethod = getCreatePetTypeMethod =
              io.grpc.MethodDescriptor.<com.example.grpcpetclinic.grpc.PetTypeRequest, com.example.grpcpetclinic.grpc.PetTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePetType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcpetclinic.grpc.PetTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcpetclinic.grpc.PetTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetTypeServiceMethodDescriptorSupplier("CreatePetType"))
              .build();
        }
      }
    }
    return getCreatePetTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PetTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceStub>() {
        @java.lang.Override
        public PetTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetTypeServiceStub(channel, callOptions);
        }
      };
    return PetTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PetTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceBlockingStub>() {
        @java.lang.Override
        public PetTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return PetTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PetTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetTypeServiceFutureStub>() {
        @java.lang.Override
        public PetTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetTypeServiceFutureStub(channel, callOptions);
        }
      };
    return PetTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPetType(com.example.grpcpetclinic.grpc.PetTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcpetclinic.grpc.PetTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePetTypeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PetTypeService.
   */
  public static abstract class PetTypeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PetTypeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PetTypeService.
   */
  public static final class PetTypeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PetTypeServiceStub> {
    private PetTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPetType(com.example.grpcpetclinic.grpc.PetTypeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpcpetclinic.grpc.PetTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePetTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PetTypeService.
   */
  public static final class PetTypeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PetTypeServiceBlockingStub> {
    private PetTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpcpetclinic.grpc.PetTypeResponse createPetType(com.example.grpcpetclinic.grpc.PetTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePetTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PetTypeService.
   */
  public static final class PetTypeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PetTypeServiceFutureStub> {
    private PetTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpcpetclinic.grpc.PetTypeResponse> createPetType(
        com.example.grpcpetclinic.grpc.PetTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePetTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PET_TYPE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PET_TYPE:
          serviceImpl.createPetType((com.example.grpcpetclinic.grpc.PetTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpcpetclinic.grpc.PetTypeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePetTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpcpetclinic.grpc.PetTypeRequest,
              com.example.grpcpetclinic.grpc.PetTypeResponse>(
                service, METHODID_CREATE_PET_TYPE)))
        .build();
  }

  private static abstract class PetTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PetTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpcpetclinic.grpc.PetTypeProtoModels.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PetTypeService");
    }
  }

  private static final class PetTypeServiceFileDescriptorSupplier
      extends PetTypeServiceBaseDescriptorSupplier {
    PetTypeServiceFileDescriptorSupplier() {}
  }

  private static final class PetTypeServiceMethodDescriptorSupplier
      extends PetTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PetTypeServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PetTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PetTypeServiceFileDescriptorSupplier())
              .addMethod(getCreatePetTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
