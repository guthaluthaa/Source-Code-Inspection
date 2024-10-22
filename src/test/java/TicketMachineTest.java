
import core.TicketMachine;
import exception.PapelMoedaInvalidaException;
import exception.SaldoInsuficienteException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketMachineTest {
    @Test
    public void InserirSaldoTicketMachine() throws PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);

        T.inserir(10);

        assertEquals(10, T.getSaldo());
    }

    // @Test
    // public void DescontarSaldoApósImprimirTicketMachine() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
    //     TicketMachine T = new TicketMachine(5);
        
    //     T.inserir(10);
    //     T.imprimir();

    //     assertEquals(5, T.getSaldo());
    // }
}

// assertThrows(PapelMoedaInvalidaException.class, () ->{
//     TicketMachine T = new TicketMachine(5); 
//     T.inserir(10);
// });