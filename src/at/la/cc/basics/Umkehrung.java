package at.la.cc.basics;

public class Umkehrung {
    public static void main(String[] args) {
        System.out.println(getReverseString("Hallo"));
    }

    public static String getReverseString(String umgedreht) {
        if (umgedreht.length() <= 1)
            return umgedreht;
        else {
            return getReverseString(umgedreht.substring(1))+umgedreht.charAt(0);
        }
    }

}
