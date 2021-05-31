package at.la.cc.carConfiguration;

public class Car {
    private Engine engine;
    private String color;
    private int basicPrice;
    private Producer producer;

    //region CONSTRUCTOR

    public Car(Engine engine, String color, int basicPrice, Producer producer) {
        this.engine = engine;
        this.color = color;
        this.basicPrice = basicPrice;
        this.producer = producer;
    }

    //endregion
    public int getPricePerCarEngine(){
        this.basicPrice = basicPrice;
        engine.getPricePerEngine();
        int priceEngine = (basicPrice  + getEngine().getPricePerEngine());
        basicPrice = priceEngine;
        return priceEngine;
    }


    public int getPriceOfCar(){
        this.basicPrice = basicPrice;
        int price = (basicPrice / 100) * (100 - getProducer().getDiscount());
        basicPrice = price;
        return price;
    }

    //region GETTER SETTER
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    //endregion


    @Override
    public String toString() {
        return "{" +
                engine +
                ", Color= " + color + '\'' +
                ", Basicprice= " + basicPrice +
                ", Producer= " + producer +
                '}';
    }
}
