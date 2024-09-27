package hexagonal.ports.out;

import java.io.IOException;

import hexagonal.domain.Salute;

public interface GreetResponse {

    void writeSalute(Salute salute) throws IOException;

}
