package at.la.cc.phone;

import java.util.Scanner;

public class Login {
    private int LoginOk;
    private String userInput;

    public boolean checkLogin() {

        Scanner input = new Scanner(System.in);

        while (LoginOk != 1) {
            System.out.println("Please enter your accountname.");
            userInput = input.nextLine();
            if (userInput.equals("Lisa")) {
                return true;
            } else
                return false;
        }
        return false;
    }
}
