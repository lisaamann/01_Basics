package at.la.cc.oop;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanzvariablen / Gedächtnisvariablen
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Hoop> hoops;
    public String colore;
    public int fuelConsumption;
    public int fuelAmount;
    public String serialNumber;
    private String brand;
    public int amountOfRepetitions;

    public Car(Engine engine, String colore, int fuelConsumption, int fuelAmount, String serialNumber, String brand, int amountOfRepetitions) {
        this.engine = engine;
        this.colore = colore;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.amountOfRepetitions = amountOfRepetitions;
        this.mirrors = new ArrayList<>();
        this.hoops = new ArrayList<>();
    }

    ;

    //region METHODEN
    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addHoop(Hoop hoop){
        this.hoops.add(hoop);
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Ich fahre.");

    }

    public void break1() {
        System.out.println("Ich bremse.");
    }

    public void turboBoost() {
        this.fuelAmount = fuelAmount;
        int minFuelAmount = (fuelAmount / 100) * 10;

        if (fuelAmount > minFuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk() {
        this.amountOfRepetitions = amountOfRepetitions;
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuttt!!");
        }
    }

    public void getRemainingRange() {
        this.amountOfRepetitions = amountOfRepetitions;
        this.fuelAmount = fuelAmount;
        int remainingRange = (fuelAmount / amountOfRepetitions) * 100;
        System.out.println("Reichweite mit aktuellen Füllstand = " + remainingRange + " km");
    }

    public void outputOfCarDetails() {
        System.out.println("Ich bin ein " + brand + ", ich habe die Farbe " + colore + " und habe " + getEngine().getHorsePower() + " PS");
    }

    //endregion

    //region GETTER SETTER


    public List<RearMirror> getMirrors() {
        return mirrors;
    }

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

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    //endregion
}
