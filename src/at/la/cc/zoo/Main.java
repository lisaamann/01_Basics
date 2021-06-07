package at.la.cc.zoo;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(50, 100);
        Animal animal2 = new Animal(20, 150);
        Zoo zoo1 = new Zoo("Kinderzoo", "Elefantenstraße");

        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        zoo1.printAnimals();

        Dog dog1 = new Dog(40,50);
        dog1.bark();
        zoo1.addAnimal(dog1);
        zoo1.printAnimals();
    }
}
