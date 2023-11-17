package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa wykorzystywana przy generowaniu ciągów liczbowy <br>
 * i wyświetlaniu ich użytkownikowi
 * 
 * @author Marcin
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda służąca do pobierania i weryfilackji argumentów
     */
    @Override
    protected boolean getArgs(String[] args) {

        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Metoda zapisująca wygenerowany ciąg
     * @return Wartość logiczna
     */
    @Override
    protected boolean wirteSeq() {

        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

    /**
     *  Metoda służąca do uruchomienia obiektu aplikacji
     */
    @Override
    public void run(String[] args) {

        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();

    }

}
