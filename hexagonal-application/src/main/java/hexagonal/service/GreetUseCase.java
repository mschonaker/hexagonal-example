package hexagonal.service;

import java.io.IOException;

import hexagonal.ports.in.GreetRequest;
import hexagonal.ports.out.GreetResponse;

public interface GreetUseCase {

    void greet(GreetRequest request, GreetResponse response) throws IOException;

}