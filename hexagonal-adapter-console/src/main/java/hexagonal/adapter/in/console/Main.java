package hexagonal.adapter.in.console;

import hexagonal.domain.Salute;
import hexagonal.domain.User;
import hexagonal.ports.in.GreetRequest;
import hexagonal.ports.out.GreetResponse;
import hexagonal.service.GreetService;

public class Main {

    public static void main(String... args) {

        var console = System.console();

        var service = new GreetService();
        service.greet(new GreetRequest() {

            @Override
            public User readUser() {
                console.printf("What's your name?\n");
                return new User(console.readLine());
            }

        }, new GreetResponse() {

            @Override
            public void writeSalute(Salute salute) {
                console.printf("%s\n", salute.message());
            }
        });
    }
}
