import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import core.PapelMoeda;


public class PapelMoedaTest {
    @Test
    public void Retornar_Valor_PapelMoeda() {
        PapelMoeda T = new PapelMoeda(10,5);

        int valor = T.getValor();

        assertEquals(10, valor);
    }

    @Test
    public void Retornar_Quantidade_PapelMoeda() {
        PapelMoeda T = new PapelMoeda(10,5);

        int valor = T.getQuantidade();

        assertEquals(5, valor);
    }
}
