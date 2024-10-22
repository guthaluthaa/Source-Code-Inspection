package src.test.java;
import src.main.java.core.TicketMachine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketMachineTest {
    @Test(exception = SaldoInsuficienteException)
    public void testSomaSimples() {
        TicketMachine T = new TicketMachine(5); 
        T.inserir(5);
        String ticket = T.imprimir();
        assertEquals(5, ticket, "A soma de 2 + 3 deve ser 5");
    }
}
