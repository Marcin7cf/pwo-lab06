package pwo.app;

/**
 * Klasa służąca do tworzenia obiektów klasy SeqToFileApp <br>
 * lub SeqToOutApp w zależności od parametrów podanych przy <br>
 * uruchamianiu programu
 *
 * @author Marcin
 * @version 1.0.0
 */
public class Sequence {

    /**
     * Funkcja uruchomieniowa aplikacji
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
