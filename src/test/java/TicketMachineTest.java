import core.TicketMachine;
import exception.PapelMoedaInvalidaException;
import exception.SaldoInsuficienteException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketMachineTest {
    @Test
    public void Inserir_Saldo_TicketMachine() throws PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);

        T.inserir(10);

        assertEquals(10, T.getSaldo());
    }
    @Test
    public void Descontar_Saldo_Após_Imprimir_TicketMachine() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);
        
        T.inserir(10);
        T.imprimir();

        assertEquals(5, T.getSaldo());
    }

    @Test
    public void Inserir_Quantia_Negativa_Deve_Ativar_Exception_TicketMachine() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);
        
        assertThrows(PapelMoedaInvalidaException.class, () -> {
            T.inserir(-10);
        });
    }

    @Test
    public void Imprimir_Com_Saldo_Insuficioente_Deve_Ativar_Exception_TicketMachine() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);
        
        assertThrows(SaldoInsuficienteException.class, () -> {
            T.imprimir();
        });
    }

    @Test
    public void Receber_Troco_TicketMachine() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        TicketMachine T = new TicketMachine(5);
        
        T.getTroco();

    }
}
