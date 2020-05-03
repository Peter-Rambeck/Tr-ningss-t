package Opg1ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Opg1ArrayList {

    ArrayList<String> arr;
    Set<String> stringSet;
    String y;

    public boolean arrBol(ArrayList arr, String y) {
        stringSet = new LinkedHashSet<>(arr);

        if (arr.contains(y)) {
            System.out.println("True");
            for (String s : stringSet) {
                System.out.println(s);
            }
            return true;
        } else {
                arr.add(y);
            System.out.println("False");
                for (String s : stringSet) {
                    System.out.println(s);
                }
                return false;
            }
        }
    }




