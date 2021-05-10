package at.la.cc.oop;

public class CarMain {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.colore = "Rot";
        c1.fuelConsumption = 7;
        c1.fuelAmount = 50;
        c1.serialNumber = "L14007";
        c1.amountOfRepetitions = 2;

        Car c2 = new Car();
        c2.colore = "Himmelblau";
        c2.fuelConsumption = 9;
        c2.fuelAmount = 30;
        c2.serialNumber = "A06755";
        c2.amountOfRepetitions = 3;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.turboBoost();
        c2.honk();
        c2.getRemainingRange();

        c2.break1();
    }
}
