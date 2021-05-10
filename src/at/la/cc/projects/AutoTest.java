package at.la.cc.projects;

import java.util.ArrayList;

public class AutoTest {
    public static void main(String[] args) {
        Auto oAuto = new Auto(218, "rot");
        //oAuto.setLeistung(218);
        System.out.println(oAuto.getLeistung());
        System.out.println(oAuto.getFarbe());

        ArrayList<Auto> autoListe = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            autoListe.add(new Auto(45, "blau"));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(autoListe.get(i).getFarbe());
        }
    }
}
