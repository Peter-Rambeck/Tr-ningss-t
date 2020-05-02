import Opg1ArrayList.Opg1ArrayList;
import Opg2Bog.Bog;
import Opg4Square.PrintSquare;
import main.java.Opg2Bog.Bibliotek;
import main.java.Opg3Græs.HitTheGrass;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Opgave 1
        /*
        String[] x = {"Fis", "i", "en", "hat", "Fis"};
        ArrayList z = new ArrayList(Arrays.asList(x));
        String y = "Fis";
        Opg1ArrayList.ArrFis( z, y);
         */

        // Opgave 2
        /*
        Bibliotek bibliotek = new Bibliotek();
        bibliotek.createBog();
        bibliotek.loop();
        Bog bog1 = new Bog(1234, "Titel1", "www");
        bibliotek.sammeISBN(bog1);

         */

        // Opgave 3

        /*
        HitTheGrass hitTheGrass = new HitTheGrass();
        hitTheGrass.grassInput();
         */

        // Opgave 4

        PrintSquare printSquare = new PrintSquare();
        printSquare.printSquare(4);
    }

}
