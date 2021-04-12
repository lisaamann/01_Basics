package at.la.cc.basics;

public class Sternchen {
    public static void main(String[] args) {
        //While Sternchen
        int i = 0;
        int d = 0;
        String stern = "*";
        while (i < 5) {
            System.out.println(stern);
            stern = stern + "*";
            i++;
        };

        while (d < 5) {
            stern = stern.substring(0, stern.length() - 1);
            System.out.println(stern);
            d++;
        };
    }
}
