package at.la.cc.basics;

public class CaeserVerschluesselung {
    public static void main(String[] args) {
        String text = "hallo";
        String entcodieren = "jcnnq";
        int verschieben = 2;

        System.out.println(stringToChar(text, verschieben));
        System.out.println(decrypt(entcodieren,verschieben));

    }

    public static String decrypt(String entcodieren, int verschieben) {
        String returned = "";
        for (int i = 0; i < entcodieren.length(); i++) {
            char c = entcodieren.charAt(i);
            if ((int) c + verschieben < 97) {
                returned+= (char) ((int) c - verschieben + 26);
            } else {
                returned+= (char) ((int) c - verschieben);
            }
        }
        return returned;
    }

    public static String stringToChar(String text, int verschieben) {
        String returned = "";
        for (int i = 0; i < text.length(); i++) {
            returned += encrypt(text.charAt(i), verschieben);
        }
        return returned;
    }

    public static char encrypt(char c, int verschieben) {
        if ((int) c + verschieben > 122) {
            return (char) ((int) c + verschieben - 122 + 97);
        } else {
            return (char) ((int) c + verschieben);
        }
    }
}