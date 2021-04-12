package at.la.cc.basics;

public class LoopAufgabe5 {
    public static void main(String[] args) {
        //Erstelle einen While-Loop, der folgendermaßen herunterzählt:
        //1000
        //991
        //982
        //973
        //Gib genau 73 zahlen aus! Dann beende den Loop.

        int zahl = 1000;
        int zaehler = 9;
        int anfang = 0;//für jede while-schleife die zahlengesteuert ist braucht man einen int mit 0
        int schleife = 0;//zum zählen der schleife

        while (schleife<73) {
            System.out.println(zahl);
            zahl = zahl - zaehler;
            schleife++;
            if (schleife==73)
                System.out.println("Schleifendurchläufe = " + schleife);
        }
    }
}
