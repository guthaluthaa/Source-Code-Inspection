package core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        
        // Cédulas de 100
        count = valor / 100;
        papeisMoeda[5] = new PapelMoeda(100, count);
        valor = valor % 100;

        // Cédulas de 50
        count = valor / 50;
        papeisMoeda[4] = new PapelMoeda(50, count);
        valor = valor % 50;

        // Cédulas de 20
        count = valor / 20;
        papeisMoeda[3] = new PapelMoeda(20, count);
        valor = valor % 20;

        valor = valor / 10;
        papeisMoeda[2] = new PapelMoeda(10, count);
        valor = valor % 10;

        // Cédulas de 5
        count = valor / 5;
        papeisMoeda[1] = new PapelMoeda(5, count);
        valor = valor % 5;

        count = valor / 2;
        papeisMoeda[0] = new PapelMoeda(2, count);
        valor = valor % 2;

    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    public class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 5; i >= 0; i--) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 5; i >= 0; i--) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
