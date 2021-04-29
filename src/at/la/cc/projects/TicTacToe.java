package at.la.cc.projects;

import java.util.Scanner;

public class TicTacToe {
    public static final int WIN_SIZE = 3;
    public static final int HIGH = 3;

    public static void main(String[] args) {
        // Player 0 and Player 1
        int activePlayer = 0;

        char[][] playground = new char[HIGH][HIGH];//Feld-Array für die Position in die er die Eingabe des Spieler setzen soll
        Scanner scanner = new Scanner(System.in);//Scanner einlesen der Eingabe durch den User

        initianalPlayground(playground);
        printIntroOfGame(playground);


        while (true) {
            System.out.println("Geben Sie Ihre Position ein");
            int selection = scanner.nextInt();

            int row = (selection - 1) / 3;
            int col = (selection - 1) % 3;


            if (activePlayer == 0) {
                playground[row][col] = 'X';
            } else {
                playground[row][col] = 'O';
            }
            printBoard(playground);
            activePlayer = getNextPlayer(activePlayer);


            // check if there is a winner.

            if (checkIfWinnerInRow(playground)) {
                System.out.println("Winner row");
                System.exit(0);

            }
            if (checkIfWinnerInCol(playground)) {
                System.out.println("Winner col");
                System.exit(0);

            }
            if (checkIfWinnerInDiagonal1(playground)) {
                System.out.println("Winner diagonal");
                System.exit(0);

            }
            if (checkIfWinnerInDiagonal2(playground)) {
                System.out.println("Winner diagonal 2");
                System.exit(0);

            } else {
                System.out.println("no winner");
            }

        }

    }


    private static boolean checkIfWinnerInRow(char[][] playground) {
        for (int row = 0; row < 3; row++) {
            boolean winner = false;
            char first = playground[row][0];
            char second = playground[row][1];
            char third = playground[row][2];
            if (first == second && second == third) {
                return winner = true;
            }
        }
        return false;
    }

    private static boolean checkIfWinnerInCol(char[][] playground) {
        for (int col = 0; col < 3; col++) {
            boolean winner = false;
            char first = playground[0][col];
            char second = playground[1][col];
            char third = playground[2][col];
            if (first == second && second == third) {

                return winner = true;
            }
        }
        return false;
    }

    private static boolean checkIfWinnerInDiagonal1(char[][] playground) {
        for (int i = 0; i <= playground.length - WIN_SIZE; i++) {
            //System.out.println("num:" + i + ":" + i);
            char found = ' ';
            boolean hasWinner = true;
            for (int j = i; j < i + WIN_SIZE; j++) {
                if (i == j) {
                    found = playground[j][j];
                } else if (found != playground[j][j]) {
                    hasWinner = false;
                    break;
                }
            }
            if (hasWinner) {
                return true;
            }

        }

        return false;
    }

    private static boolean checkIfWinnerInDiagonal2(char[][] playground) {//DAS STIMMT NOCH NICHT. ICH GLAUBE ES LIEGT AN DER IF-BEDINGUNG
        for (int i = 0; i < 2; i++) {
            //System.out.println("num:" + i + ":" + i);
            char found = ' ';
            boolean hasWinner = false;
            for (int j = 2; j >= 0; j--) {
                if (playground[0][2] == playground[1][1] && playground[1][1] == playground[2][0]) {
                    hasWinner = true;
                    break;
                } if (playground[0][2] != playground[1][1]) {
                    hasWinner = false;
                    break;
                }
            }
            if (hasWinner) {
                return true;
            }

        }
        return false;
    }

    private static int getNextPlayer(int activePlayer) {
        if (activePlayer == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static void initianalPlayground(char[][] playground) {
        playground[0][0] = '1';
        playground[0][1] = '2';
        playground[0][2] = '3';
        playground[1][0] = '4';
        playground[1][1] = '5';
        playground[1][2] = '6';
        playground[2][0] = '7';
        playground[2][1] = '8';
        playground[2][2] = '9';
    }

    private static void printIntroOfGame(char[][] playground) {
        System.out.println("TiC-TaC-ToE");
        System.out.println("");
        System.out.println("Spieler Eins beginnt und hat den Füllwert X");
        System.out.println("Zur Positionsvergabe Ihres Tipps geben Sie das gewünschte Feld mit der Nummer an.");
        System.out.println("");
        printBoard(playground);//Methode für das Spielfeld das angedruckt ausgegeben wird
        System.out.println("");
    }

    private static void printBoard(char[][] playground) {
        System.out.println("|---|---|---|");
        System.out.println("|-" + playground[0][0] + "-|-"
                + playground[0][1] + "-|-" + playground[0][2]
                + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + playground[1][0] + "-|-"
                + playground[1][1] + "-|-" + playground[1][2]
                + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + playground[2][0] + "-|-"
                + playground[2][1] + "-|-" + playground[2][2]
                + "-|");
        System.out.println("|---|---|---|");
    }

}
