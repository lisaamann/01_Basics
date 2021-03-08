package at.la.cc.basics;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        int max = 10;
        int min = 30;

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1);
    }
}
