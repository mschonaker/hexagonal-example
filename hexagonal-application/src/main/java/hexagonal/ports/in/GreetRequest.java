package hexagonal.ports.in;

import hexagonal.domain.User;

public interface GreetRequest {

    User readUser();

}
