package at.la.cc.oop;

import java.io.OutputStream;

public class CarMain {
    public static void main(String[] args) {

        Engine e1 = new Engine(100, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(200, Engine.TYPE.GAS);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Hoop h1 = new Hoop(17, 1);
        Hoop h2 = new Hoop(17, 2);
        Hoop h3 = new Hoop(17, 3);
        Hoop h4 = new Hoop(17, 4);

        Car c1 = new Car(e1,"Rot", 7, 50, "L14007", "GaudiAudi", 2);
        Car c2 = new Car(e2, "Himmelblau", 9, 30, "A06755", "Golf", 3);
        Car c3 = new Car(e1,"Rosarot", 4, 55, "R1414", "MiniCooper", 2);

        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.addHoop(h1);
        c1.addHoop(h2);
        c1.addHoop(h3);
        c1.addHoop(h4);

        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.turboBoost();
        c2.honk();
        c2.getRemainingRange();
        c1.outputOfCarDetails();

        c2.break1();
    }
}
