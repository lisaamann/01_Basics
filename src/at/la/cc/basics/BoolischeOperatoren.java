package at.la.cc.basics;

public class BoolischeOperatoren {
    public static void main(String[] args) {
        //Der Fahrer darf das Motorrad fahren wenn er 24 Jahre oder aelter ist
        //oder den Motorradführerschein besitzt aber nicht mehr in der Probezeit ist
        int alter = 24;
        boolean motorradfuehrerschein = true;
        boolean probezeitVorbei = true;

        if ((alter >= 24) || (motorradfuehrerschein == true) && (probezeitVorbei == true)){
            System.out.println("Du darfst Motorrad fahren");
        }if ((alter < 24) || (motorradfuehrerschein == false) || (probezeitVorbei == false)){
            System.out.println("Du darfst nicht mit dem Motorrad fahren.");
        };

        //Das Kind darf den Kinofilm sehen wenn es älter als 14 ist, oder ein Elternteil mit dabei hat
        int alterKind = 12;
        boolean elternDabei = false;

        if (alterKind >= 14){
            System.out.println("Du darfst den Film anschauen");
        }if (alterKind < 14 && elternDabei == true) {
            System.out.println("Du darfst den Film sehen weil deine Eltern dabei sind");
        }if (alterKind < 14 && elternDabei == false){
            System.out.println("Du bist zu jung und nicht in Begleitung eines Erwachsens, du darfst den Film nicht sehen");
        };

        //Wenn ich den Kurs "Softwarearchitekturen" besuchen möchte, muss ich den Coding Campus besucht haben
        // oder bereits 2 Jahre Berufserfahrung vorweisen
        boolean cc = true;
        int berufserfahrung = 1;

        if (cc == true || berufserfahrung >= 2) {
            System.out.println("Du darfst Softwarearchitekturen am CC besuchen");
        }if(cc == false && berufserfahrung < 2){
                System.out.println("Du erfüllst leider nicht die Kriterien");
            }
        };

}
