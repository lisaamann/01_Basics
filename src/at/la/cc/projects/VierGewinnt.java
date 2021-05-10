package at.la.cc.projects;

import java.util.Scanner;

public class VierGewinnt {
    public static final int WIN_SIZE = 4;
    public static final int HIGH = 6;
    public static final int LENGTH = 7;

    public static void main(String[] args) {
        int activePlayer = 0;

        char[][] playground = new char[HIGH][LENGTH];//Feld-Array für die Position in die er die Eingabe des Spieler setzen soll
        Scanner scanner = new Scanner(System.in);//Scanner einlesen der Eingabe durch den User

        initianalPlayground(playground);
        printIntroOfGame(playground);

        while (true) {
            System.out.println("Geben Sie die Spalte an in der Sie auf die nächste freie Position setzen wollen.");
            int column = scanner.nextInt();

            int freeRow = getFreeRow(playground, column);
            //Validierung der FreeRow

            if (activePlayer == 0) {
                playground[freeRow][column] = 'X';
            } else {
                playground[freeRow][column] = 'O';
            }
            printBoard(playground);
            activePlayer = getNextPlayer(activePlayer);
            checkWinnerInRowX(playground);
            //checkWinnerInRowO(playground);

        }
    }

    private static void initianalPlayground(char[][] playground) {
        playground[0][0] = '_';
        playground[0][1] = '_';
        playground[0][2] = '_';
        playground[0][3] = '_';
        playground[0][4] = '_';
        playground[0][5] = '_';
        playground[0][6] = '_';

        playground[1][0] = '_';
        playground[1][1] = '_';
        playground[1][2] = '_';
        playground[1][3] = '_';
        playground[1][4] = '_';
        playground[1][5] = '_';
        playground[1][6] = '_';

        playground[2][0] = '_';
        playground[2][1] = '_';
        playground[2][2] = '_';
        playground[2][3] = '_';
        playground[2][4] = '_';
        playground[2][5] = '_';
        playground[2][6] = '_';

        playground[3][0] = '_';
        playground[3][1] = '_';
        playground[3][2] = '_';
        playground[3][3] = '_';
        playground[3][4] = '_';
        playground[3][5] = '_';
        playground[3][6] = '_';

        playground[4][0] = '_';
        playground[4][1] = '_';
        playground[4][2] = '_';
        playground[4][3] = '_';
        playground[4][4] = '_';
        playground[4][5] = '_';
        playground[4][6] = '_';

        playground[5][0] = '_';
        playground[5][1] = '_';
        playground[5][2] = '_';
        playground[5][3] = '_';
        playground[5][4] = '_';
        playground[5][5] = '_';
        playground[5][6] = '_';

    }

    private static void printBoard(char[][] playground) {
        System.out.println("|_" + playground[0][0] + "_|_" + playground[0][1] + "_|_" + playground[0][2] + "_|_" + playground[0][3] + "_|_" + playground[0][4] + "_|_" + playground[0][5] + "_|_" + playground[0][6] + "_|");
        System.out.println("|_" + playground[1][0] + "_|_" + playground[1][1] + "_|_" + playground[1][2] + "_|_" + playground[1][3] + "_|_" + playground[1][4] + "_|_" + playground[1][5] + "_|_" + playground[1][6] + "_|");
        System.out.println("|_" + playground[2][0] + "_|_" + playground[2][1] + "_|_" + playground[2][2] + "_|_" + playground[2][3] + "_|_" + playground[2][4] + "_|_" + playground[2][5] + "_|_" + playground[2][6] + "_|");
        System.out.println("|_" + playground[3][0] + "_|_" + playground[3][1] + "_|_" + playground[3][2] + "_|_" + playground[3][3] + "_|_" + playground[3][4] + "_|_" + playground[3][5] + "_|_" + playground[3][6] + "_|");
        System.out.println("|_" + playground[4][0] + "_|_" + playground[4][1] + "_|_" + playground[4][2] + "_|_" + playground[4][3] + "_|_" + playground[4][4] + "_|_" + playground[4][5] + "_|_" + playground[4][6] + "_|");
        System.out.println("|_" + playground[5][0] + "_|_" + playground[5][1] + "_|_" + playground[5][2] + "_|_" + playground[5][3] + "_|_" + playground[5][4] + "_|_" + playground[5][5] + "_|_" + playground[5][6] + "_|");
        System.out.println("|_" + 0 + "_|_" + 1 + "_|_" + 2 + "_|_" + 3 + "_|_" + 4 + "_|_" + 5 + "_|_" + 6 + "_|");
    }

    private static void printIntroOfGame(char[][] playground) {
        System.out.println("Vier Gewinnt");
        System.out.println("");
        System.out.println("Spieler Eins beginnt und hat den Füllwert X");
        System.out.println("Zur Positionsvergabe Ihres Tipps geben Sie die gewünschte Spalte mittels Position an.");
        System.out.println("");
        printBoard(playground);//Methode für das Spielfeld das angedruckt ausgegeben wird
        System.out.println("");
    }

    private static int getNextPlayer(int activePlayer) {
        if (activePlayer == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int getFreeRow(char[][] playground, int column) {
        for (int position = 5; position >= 0; position--) {
            if (playground[position][column] == '_')
                return position;
        }
        return -1;

    }

    public static boolean checkWinnerInRowX(char[][] playground) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < HIGH - 3; j++) {
                if (playground[i][j] == 'X') {
                    for (int l = j; l < j + WIN_SIZE; l++) {
                        if (playground[i][l] != 'X') {
                            break;
                        } else if (playground[i][l] == 'X' && l == j + 3)
                            return true;
                    }
                }
            }
        }
        return false;
   }

 /*   public static boolean checkWinnerInRowO(char[][] playground) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < HIGH - 3; j++) {
                if (playground[i][j] == 'O') {
                    for (int l = j; l < j + WIN_SIZE; l++) {
                        if (playground[i][l] != 'O') {
                            break;
                        } else if (playground[i][l] == 'O' && l == j + 3)
                            return true;
                    }
                }
            }
        }
        return false;
    }*/

}

