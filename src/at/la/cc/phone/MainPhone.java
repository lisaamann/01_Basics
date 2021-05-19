package at.la.cc.phone;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        SIM sim1 = new SIM(1, "06601234567");

        SDCard card1 = new SDCard(250);
        Phone iPhone1 = new Phone(sim1, card1, "Blue");

        iPhone1.doLogin();
        iPhone1.sayHello();
        iPhone1.makeCall();
        iPhone1.takePicture();



    }
}
