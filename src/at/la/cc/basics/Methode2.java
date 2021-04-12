package at.la.cc.basics;

public class Methode2 {
    public static void main(String[] args) {
        String firstName = "Susi";
        String lastName = "Müller";
        boolean isMale = false;
        System.out.println(anrede(firstName, lastName, isMale));


    }
    public static boolean anrede(String vorname, String nachname, boolean isMale){
        if (isMale == true){
            System.out.println("Sehr geehrter Herr " + vorname + " " + nachname);
        }else if(isMale == false){
            System.out.println("Sehr geehrte Frau " + vorname + " " + nachname);
        }
        return true;
    }
}
