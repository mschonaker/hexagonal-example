package hexagonal.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import hexagonal.domain.Salute;
import hexagonal.domain.User;
import hexagonal.ports.in.GreetRequest;
import hexagonal.ports.out.GreetResponse;

public class GreetServiceTest {

    @Test
    public void greetTest() {
        var service = new GreetService();
        service.greet(new GreetRequest() {

            @Override
            public User readUser() {
                return new User("Test");
            }

        }, new GreetResponse() {

            @Override
            public void writeSalute(Salute salute) {
                assertEquals(salute.message(), "Howdy, Test!");
            }

        });
    }
}
