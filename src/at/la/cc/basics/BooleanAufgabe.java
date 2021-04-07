package at.la.cc.basics;

public class BooleanAufgabe {
    public static void main(String1[] args) {
        //Wenn nur noch zwei Schokoladen im Kühlschrank sind, muss ich neue kaufen.

        int anzahlSchokolade = 3;
        if(anzahlSchokolade >= 2) {
            System.out.println("Geh Schokolade kaufen");
        } else if(anzahlSchokolade < 2) {
            System.out.println("Juhu");
        };

        //Ich finde es prima, wenn Feiertag ist, aber kein Wochenende.

        String1 tag = "Feiertag";
        if(tag == "Feiertag") {
            System.out.println("Juhu Feiertag");
        } else if(tag == "Wochenende") {
            System.out.println("Ich mag kein Wochenende");
        } else {
            System.out.println("Ein Tag wie jeder andere.");
        };

        //Wenn ich genug Geld dabei habe oder wenn ich meine Bankkarte dabei und genug Geld auf dem Konto habe, muss ich meiner Freundin neue Schuhe kaufen.

        String1 geld = "Pleite";
        if(geld == "Genug Bargeld") {
            System.out.println("Schatz ich kauf dir Schuhe");
        } else if(geld == "Kreditkarte ist voll") {
            System.out.println("Schatz ich kauf dir Schuhe");
        } else {
            System.out.println("Schatz kauf dir selber Schuhe");
        };

        //Wahrheitswert
        boolean isWeekend = true;
        if (isWeekend) {
            System.out.println("Juhu es ist Wochenende!!!");
        }else {
            System.out.println("Juhu Programmieren!!!");
        };

        //Wahrheitswert2
        boolean isButterEmpty = false;
        boolean isCheeseEmpty = true;
        if (isButterEmpty || isCheeseEmpty) {
            System.out.println("Geh einkaufen");
        }else {
            System.out.println("Keine Panik! Kühlschrank ist voll.");
        };
    }
}
