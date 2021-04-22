package at.la.cc.projects;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] playground = new char[3][3];//Feld-Array für die Position in die er die Eingabe des Spieler setzen soll
        Scanner scanner = new Scanner(System.in);//Scanner einlesen der Eingabe durch den User
        playground[0][0] = '1';
        playground[0][1] = '2';
        playground[0][2] = '3';
        playground[1][0] = '4';
        playground[1][1] = '5';
        playground[1][2] = '6';
        playground[2][0] = '7';
        playground[2][1] = '8';
        playground[2][2] = '9';

        System.out.println("TiC-TaC-ToE");
        System.out.println("");
        printBoard(playground);//Methode für das Spielfeld das angedruckt ausgegeben wird
        System.out.println("");
        System.out.println("Spieler Eins beginnt und hat den Füllwert X");
        System.out.println("Zur Positionsvergabe Ihres Tipps geben Sie Koordinaten komagetrennt ein.");


        String inputUser1 = scanner.next();//Damit liest der User ein mit 0,2 zum Beispiel auf welche Position er das X/O setzen will
        String inputUser2 = scanner.next();//Damit liest der User ein mit 0,2 zum Beispiel auf welche Position er das X/O setzen will
        String[] fieldPosition1 = inputUser1.split(",");//das Komma sagt dass es an dieser Stelle aufgeteilt wird. Hier wird die Positionseingabe in ein String-Array gespeichert
        String[] fieldPosition2 = inputUser2.split(",");
        int posOneFromUser1Input = Integer.parseInt(fieldPosition1[0]);//hiermit wandle ich den String aus dem String-Array in eine Zahl um. Hier speichere ich mir die Postion 1 im zweidimensionalen Array
        int posTwoFromUser1Input = Integer.parseInt(fieldPosition1[1]);//hier speichere ich mir die Postion 2 im zweidimensionalen Array
        int posOneFromUser2Input = Integer.parseInt(fieldPosition2[0]);//hiermit wandle ich den String aus dem String-Array in eine Zahl um. Hier speichere ich mir die Postion 1 im zweidimensionalen Array
        int posTwoFromUser2Input = Integer.parseInt(fieldPosition2[1]);


       // if ()


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
