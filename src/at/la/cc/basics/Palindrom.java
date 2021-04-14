package at.la.cc.basics;

public class Palindrom {
    public static void main(String[] args) {

        String palindrom = "Lisa";
        int startString = 0;
        int endString = palindrom.length() - 1;

        boolean isPalindom = true;
        while (startString < endString) {
            if (palindrom.charAt(startString) != palindrom.charAt(endString)) {
                isPalindom = false;
                break;
            }
            startString++;
            endString--;
        }
        if (isPalindom) {
            System.out.println("Ist ein Palindrom");
        }else {
            System.out.println("Ist kein Palindrom");
        }
    }
}
