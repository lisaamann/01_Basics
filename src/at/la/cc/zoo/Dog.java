package at.la.cc.zoo;

public class Dog extends Animal{

    public Dog(int weigth, int size) {
        super(weigth, size);
    }

    public void bark(){
        System.out.println("Wuff");
    }
}
