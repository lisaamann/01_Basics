package at.la.cc.cars;

public class CarCalculator {
    public static void main(String[] args) {

        Engine e1 = new Engine(170, Engine.TYPE.DIESEL);

        producer p1 = new producer(producer.BRAND.AUDI);
        producer p2 = new producer(producer.BRAND.SKODA);



        Car c1 = new Car(e1,"blue", 200, 50000, 5, p1);
        c1.setEngine(e1);
        c1.setProducer(p1);

        Car c2 = new Car(e1, "Rot", 210, 45000, 7, p2);

        System.out.println(c1.getProducer().getBrand());
        System.out.println(c1.getEngine().getHorsePower());
        System.out.println(c1.selectPriceOfCar());

    }
}
