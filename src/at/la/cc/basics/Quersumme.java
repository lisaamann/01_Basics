package at.la.cc.basics;

public class Quersumme {
    public static void main(String[] args) {
        //wie man eine quersumme ausrechnet

        int quersumme = 1254; //Quersumme = 12

        //integer in string umwandeln
        String integerToString = Integer.toString(quersumme);
        char[] zahlenfolge = integerToString.toCharArray();

        //zahlenfolge.lenght sagt er soll solange durchgehen wie die abfolge des arrays lang ist
        int sum = 0;
        for (int i = 0; i < zahlenfolge.length; i++) {
            //das heißt die zahlenfolge ausgeben an der stelle i
            sum = sum + Character.getNumericValue(zahlenfolge[i]); //das getnumeric-tralala macht man damit man den Wert aus der
            // Ascii_Tabelle bekommt und nicht den Code => Wert = 3, Code = 51

        }
        System.out.println(sum);


    }


}
