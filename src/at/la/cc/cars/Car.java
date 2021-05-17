package at.la.cc.cars;

public class Car {
    private Engine engine;
    private String colore;
    private int maxSpeed;
    private int basicPrice;
    private int basicWaste;
    private Producer producer;

    public Car(Engine engine, String colore, int maxSpeed, int basicPrice, int basicWaste, Producer producer) {
        this.engine = engine;
        this.colore = colore;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPrice;
        this.basicWaste = basicWaste;
        this.producer = producer;
    }

    //METHODEN
    public int selectPriceOfCar(){
        int price = (basicPrice / 100) * (100 - getProducer().getDiscount());
        return price;
    }


    //region GETTER SETTER
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public int getBasicWaste() {
        return basicWaste;
    }

    public void setBasicWaste(int basicWaste) {
        this.basicWaste = basicWaste;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

//endregion
}
