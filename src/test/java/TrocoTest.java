import core.PapelMoeda;
import core.Troco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import org.junit.jupiter.api.BeforeEach;

class TrocoTest {

    Troco troco;

    @BeforeEach
    void setUp() {
        // Inicializa com um valor que requer várias denominações
        troco = new Troco(186); // Deve resultar em 1 nota de 100, 1 de 50, 1 de 20, 1 de 10, 1 de 5 e 3 de 2.
    }

    @Test
    void Construtor_Troco() {
        Troco troco= new Troco(186);

        assertNotNull(troco, "Troco deve ser criado com sucesso");
    }

    @Test
    void Iterator_HasNext_Troco() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertTrue(iterator.hasNext());
    }

    @Test
    void Iterator_Next_Troco() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertNotNull(iterator.next());
    }

    @Test
    void Iterator_Remove_Troco() {

        Iterator<PapelMoeda> iterator = troco.getIterator();

        iterator.remove();

        assertFalse(iterator.hasNext());
    }

}