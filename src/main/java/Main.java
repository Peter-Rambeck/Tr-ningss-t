import Opg1ArrayList.Opg1ArrayList;
import Opg2Bog.Bog;
import Opg3Græs.HitTheGrass;
import Opg4Square.PrintSquare;
import Opg5MenuValg.MenuValg;
import main.java.Opg2Bog.Bibliotek;
import java.util.ArrayList;


import static Opg1ArrayList.Opg1ArrayList.*;

public class Main {

    public static void main(String[] args) {

        // Opgave 1

        /*
        String in = "Et mystiskt tilfælde";
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Et");
        arr.add("mystiskt");
        arr.add("tilfælde");
        arr.add("null");

        String y = "null";

        Opg1ArrayList opg1ArrayList = new Opg1ArrayList();
        opg1ArrayList.arrBol(arr, y);
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
        /*
        PrintSquare printSquare = new PrintSquare();
        printSquare.printSquare(-2, '*');
        */

        // Opgave 5
        MenuValg menuValg = new MenuValg();
        menuValg.dialogueMenu();


    }

}
