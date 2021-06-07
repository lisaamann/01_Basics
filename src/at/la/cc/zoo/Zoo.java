package at.la.cc.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String name;
    public String street;
    private List<Animal> animals;

    //region CONSTRUCTOR
    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }
    //endregion

    //region METHODE
    public void makeShow(){
        System.out.println("The Show just has started");
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void printAnimals(){
        for (Animal animal : this.animals){
            System.out.println("Animal weight: " + animal.getWeigth());
        }
    }
    //endregion

    //region GETTER SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    //endregion
}
