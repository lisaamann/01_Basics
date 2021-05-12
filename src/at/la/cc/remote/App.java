package at.la.cc.remote;

public class App {
    public static void main(String[] args) {
        Batterie b1 = new Batterie();
        Batterie b2 = new Batterie();
        Batterie b3 = new Batterie();

        Remote r1 = new Remote();
        r1.addBatterie(b1);
        r1.addBatterie(b2);
        r1.addBatterie(b3);

        System.out.println(r1.getStatusOfBatteries());
        r1.selectChannel(7);
        System.out.println(r1.getStatusOfBatteries());
        r1.selectChannel(2);
        System.out.println(r1.getStatusOfBatteries());

    }
}
