package at.la.cc.cars;

public class CarCalculator {
    public static void main(String[] args) {

        Engine e1 = new Engine(170, Engine.TYPE.DIESEL);

        Producer p1 = new Producer(Producer.BRAND.AUDI);
        Producer p2 = new Producer(Producer.BRAND.SKODA);


        p1.getDiscount();
        Car c1 = new Car(e1,"blue", 200, 50000, 5, p1);
        c1.setEngine(e1);
        c1.setProducer(p1);

        Car c2 = new Car(e1, "Rot", 210, 45000, 7, p2);

        System.out.println(c1.getProducer().getBrand());
        System.out.println(c1.getEngine().getHorsePower());
        System.out.println("Your carprice less the branddiscount is: " + c1.selectPriceOfCar());
        c1.setDrivenDistance(20000);
        System.out.println(c1.getBasicWaste());
        c1.setDrivenDistance(51000);
        System.out.println(c1.getBasicWaste());

    }
}
