package Opg2Bog;

import java.util.Date;
import java.util.Objects;

public class Bog {

    int ISBN;
    String titel;
    String udgivelsesår;

    // Constructor
    public Bog(int ISBN, String titel, String udgivelsesår) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public void equals(int ISBN) {
        int x = 0;
        // if (ISBN.equals(x)) {
        if (Objects.equals(ISBN, x)) {
            System.out.println(ISBN);
        } else {
            System.out.println(x);
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    /*

    public Date getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(Date udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

     */

    @Override
    public String toString() {
        return "Bog: " +
                "ISBN=" + ISBN +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår;
    }





}
