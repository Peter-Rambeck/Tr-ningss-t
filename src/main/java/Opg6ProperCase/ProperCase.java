package Opg6ProperCase;

public class ProperCase {

    String str;

    public String changeWord(String str) {
        String retVal = "";
        String[] str2 = str.split(" ");

        try {
        if (str2.length == 0) {

            for (String v : str2) {
                if (v.length() > 3) {
                    String up = v.substring(0, 1).toUpperCase();
                    String lo = v.substring(1, v.length()).toLowerCase();
                    v = (up + lo);
                } else if (v.length() <= 3) {
                    String low = v.toLowerCase();
                    v = low;
                }
                System.out.println(v);
            }
        }
    } catch (NullPointerException e) {
            System.out.println("Hat");
        }
        return retVal;
    }
}