package at.la.cc.basics;

public class StringHelper {
    public static void main(String[] args) {
        isPalindrome();
        countLetters();
        reverseString();
        printAmountOfLetters();

    }

    private static void printAmountOfLetters() {
        String string = "Hallo Lisa";
        string = string.replace(" ", "");
        while (string.length()>0){
            char c = string.charAt(0);
            System.out.println(c + " kommt " + countChar(string, c) + " mal vor");
            string = string.replace("" + c, "");
        }
    }

    private static int countChar(String string, char c){
        int count = 0;
        while (string.indexOf(c) != -1){
            count++;
            string=string.substring((string.indexOf(c)+1));
        }
        return count;
    }

    private static void reverseString() {
        String word1 = "Hallo";
        if (word1.length() <= 1)
            System.out.println(word1);
        else {
            System.out.println((word1.substring(1))+word1.charAt(0));
        }
    }

    private static void countLetters() {
        String word = "Hello";
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' ')
                counter++;
        }
        System.out.println("Anzahl Char's im String= " + counter);
    }

    private static void isPalindrome() {
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
        } else {
            System.out.println("Ist kein Palindrom");
        }
    }


}
