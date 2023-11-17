package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa wykorzystywana przy generowaniu elementów ciągu Tribonacciego
 * @author Marcin
 * @version 1.0.0
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Konstruktor klasy TribonacciGenerator
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Powoduje, że metoda {@link #nextTerm()} rozpoczyna od 0.<br>
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Zwraca koleny wyraz ciągu.
     *
     * @return Wartość wyrazu ciągu
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}