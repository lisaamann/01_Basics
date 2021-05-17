package at.la.cc.cars;

public class Car {
    private Engine engine;
    public String colore;
    public int maxSpeed;
    public int basicPrice;
    public int basicWaste;
    public producer producer;
    public int d;

    public Car(Engine engine, String colore, int maxSpeed, int basicPrice, int basicWaste, producer producer) {
        this.engine = engine;
        this.colore = colore;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPrice;
        this.basicWaste = basicWaste;
        this.producer = producer;
    }

    //METHODEN
    public int selectPriceOfCar(){
        int price = (basicPrice / 100) * (100 - getProducer().getDiscountPerBrand());
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

    public at.la.cc.cars.producer getProducer() {
        return producer;
    }

    public void setProducer(at.la.cc.cars.producer producer) {
        this.producer = producer;
    }

//endregion
}
