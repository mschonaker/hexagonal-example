package hexagonal.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import hexagonal.domain.Salute;
import hexagonal.domain.User;
import hexagonal.ports.in.GreetRequest;
import hexagonal.ports.out.GreetResponse;
import hexagonal.service.GreetService;

public class GreetServiceTest {

    @Test
    public void greetTest() throws IOException {
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
