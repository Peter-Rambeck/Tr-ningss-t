package Opg1ArrayList;

import java.util.ArrayList;

public class Opg1ArrayList {

    ArrayList<String> arr;
    String y;

    public static boolean ArrFis(ArrayList arr, String y) {
        //boolean x = false;
        if (arr.contains(y)) {
            return true;
        } else {
            arr.add(y);
            return false;
        }
        //return x;
    }
}