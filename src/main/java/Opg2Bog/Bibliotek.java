package Opg2Bog;

import Opg2Bog.Bog;
import java.util.ArrayList;

public class Bibliotek {

    ArrayList<Bog> bogliste = new ArrayList<>();


    public void createBog() {

        Bog bog1 = new Bog(1234, "Titel1", "2020");
        bogliste.add(bog1);

        Bog bog2 = new Bog(4567, "Titel2", "2018");
        bogliste.add(bog2);

        Bog bog3 = new Bog(8765, "Titel3", "2019");
        bogliste.add(bog3);

    }

    // Print out bogliste
    public void loop() {
        for (int i = 0; i < bogliste.size(); i++) {
            Bog str = bogliste.get(i);
            System.out.println(str);
        }
    }


    public boolean sammeISBN(Bog bogx) {
        boolean retVal = false;

        int isbn1 = bogx.getISBN();
        System.out.println("isbn1 " +isbn1);

        for (Bog bog : bogliste) {
            System.out.println("bog " + bog.ISBN);
            //System.out.println(ISBN);
            // int isbn2 = bog.getISBN();

            if (isbn1 == bog.ISBN) {
                System.out.println("true");
                retVal = true;
            } else {
                System.out.println("false");
                retVal = false;
            }

        }
        return retVal;

        }
    }
