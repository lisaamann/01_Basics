package at.la.cc.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array3 {
    public static void main(String1[] args) {

        List<Integer> zahl = Arrays.asList(8, 3, 2, 22, 8, 22);

        for (int i = 0; i < 6; i++) {
            int ausgabe = zahl.get(i);
            Collections.sort(zahl);
            System.out.println(ausgabe);


        }
    }
}
