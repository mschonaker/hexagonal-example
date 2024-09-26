package hexagonal.service;

import hexagonal.ports.in.GreetRequest;
import hexagonal.ports.out.GreetResponse;

public interface GreetUseCase {

    void greet(GreetRequest request, GreetResponse response);

}