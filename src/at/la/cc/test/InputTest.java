package at.la.cc.test;

import java.util.Scanner;

public class InputTest {
    public static final int WIN_SIZE = 3;

    public static void main(String[] args) {
        char[][] playground = new char[3][3];
        playground[0][0] = 'o';
        playground[0][1] = ' ';
        playground[0][2] = ' ';
        playground[1][0] = ' ';
        playground[1][1] = 'x';
        playground[1][2] = 'o';
        playground[2][0] = 'x';
        playground[2][1] = ' ';
        playground[2][2] = 'o';


        boolean winner = checkIfWinnerInDiagonal2(playground);
        System.out.println(winner);

    }

    private static boolean checkIfWinnerInDiagonal2(char[][] playground) {//DAS STIMMT NOCH NICHT. ICH GLAUBE ES LIEGT AN DER IF-BEDINGUNG
        for (int i = 0; i < playground.length; i++) {
            //System.out.println("num:" + i + ":" + i);
            char found = ' ';
            boolean hasWinner = true;
            for (int j = 2; j >= 0; j--) {
                System.out.println(">>" + playground[i][j] + "<< " + i + " " + j);
                if (playground[0][3] == playground[1][1] && playground[1][1] == playground[2][0]) {
                    hasWinner = true;
                    break;
                } if (playground[0][3] != playground[1][1]) {
                    hasWinner = false;
                    break;
                }
            }
            if (hasWinner) {
                return true;
            }
            break;

        }
        return false;
    }

}
