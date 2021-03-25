package at.la.cc.basics;

public class MethodenDaniel {
    public static void main(String[] args) {

        String output = sagHallo("Hallo");
        System.out.println(output);

        output = sagHallo("Lisa");
        System.out.println(output);



        sagHallo();


    }
    public static String sagHallo(String input) {
        return input;
    }

    public static void sagHallo() {
        System.out.println("hald");
    }
}
