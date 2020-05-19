package Opg2Bog;

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

    // Equals Method, compare 2 objects
    public boolean equals(int ISBN) {
        boolean retVal = false;
        int x = 0;
        if (Objects.equals(ISBN, x)) {
            retVal = true;
        } else {
            System.out.println(x);
        }
        return retVal;
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


    @Override
    public String toString() {
        return "Bog: " +
                "ISBN=" + ISBN +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår;
    }

}
