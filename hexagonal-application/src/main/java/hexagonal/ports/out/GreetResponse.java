package hexagonal.ports.out;

import hexagonal.domain.Salute;

public interface GreetResponse {

    void writeSalute(Salute salute);

}
