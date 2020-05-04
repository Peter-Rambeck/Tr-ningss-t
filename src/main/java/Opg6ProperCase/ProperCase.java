package Opg6ProperCase;

public class ProperCase {

    String str;

    public String changeWord(String str) {
        String retVal = "";
        String[] x = str.split(" ");

        for (String v : x) {
            if (v.length() > 3) {
                String up = v.substring(0, 1).toUpperCase();
                String lo = v.substring(1, v.length()).toLowerCase();
                v = (up + lo);
            }
            System.out.println(v);
        }
        return retVal;
    }
}