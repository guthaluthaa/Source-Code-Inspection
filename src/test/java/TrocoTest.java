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
        troco = new Troco(186);
    }

    @Test
    void Construtor_Troco() {
        Troco troco= new Troco(186);

        assertNotNull(troco, "Troco deve ser criado com sucesso");
    }

    @Test
    public void testTroco186() {
        Troco troco = new Troco(186);
        PapelMoeda[] papeisMoeda = troco.getPapeisMoedas();
        
        assertEquals(1, papeisMoeda[5].getQuantidade()); // 1 nota de 100
        assertEquals(1, papeisMoeda[4].getQuantidade()); // 1 nota de 50
        assertEquals(1, papeisMoeda[3].getQuantidade()); // 1 nota de 20
        assertEquals(1, papeisMoeda[2].getQuantidade()); // 1 nota de 10
        assertEquals(1, papeisMoeda[1].getQuantidade()); // 1 nota de 5
        assertEquals(0, papeisMoeda[0].getQuantidade()); // 0 notas de 2
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