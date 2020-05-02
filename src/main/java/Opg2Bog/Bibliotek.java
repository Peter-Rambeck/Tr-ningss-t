package main.java.Opg2Bog;

import Opg2Bog.Bog;
import java.util.ArrayList;

public class Bibliotek {
    
    ArrayList<Bog> bogliste = new ArrayList<>();


    public void createBog() {

        Bog bog1 = new Bog(1234, "Titel1", "www");
        bogliste.add(bog1);

        Bog bog2 = new Bog(5678, "Titel2", "xxx");
        bogliste.add(bog2);

        Bog bog3 = new Bog(9012, "Titel3", "yyy");
        bogliste.add(bog3);

    }


    public void loop() {
        for (int i = 0; i < bogliste.size(); i++) {
            Bog str = bogliste.get(i);
            System.out.println(str);
        }
    }


    public boolean sammeISBN(Bog bogx) {
        int isbn1 = bogx.getISBN();
        System.out.println(isbn1);
        for (Bog bog : bogliste) {
            int isbn2 = bog.getISBN();
            if (isbn1 == isbn2) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
        return false;
    }
}