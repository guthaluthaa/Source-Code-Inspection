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

    @Test
    public void Construtor_Sucesso_PapelMoeda() {
        int valorEsperado = 20;
        int quantidadeEsperada = 5;
        
        PapelMoeda papelMoeda = new PapelMoeda(valorEsperado, quantidadeEsperada);
        
        assertEquals(valorEsperado, papelMoeda.getValor());
        assertEquals(quantidadeEsperada, papelMoeda.getQuantidade());
    }
}
