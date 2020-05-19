package Opg1ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Opg1ArrayList {

    ArrayList<String> arr;
    // Set<String> stringSet;
    String strInput;

    public boolean arrBol(ArrayList<String> arr, String strInput) {
        // ArrayList<String> newArr = new ArrayList<>();

        boolean retVal = false;

        // Catch null case vale
        if (arr != null && strInput != null) {

            if (arr.contains(strInput)) {
                retVal = true;
            } else {
                arr.add(strInput);
            }

            Collections.sort(arr);
            System.out.println(arr);


        } else {
            System.out.println("Contains null value");
        }
        System.out.println(retVal);
        return retVal;
    }
}






