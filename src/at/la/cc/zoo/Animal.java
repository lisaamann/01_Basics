package at.la.cc.zoo;

public class Animal {
    public int weigth;
    public int size;

    //region CONSTRUCTOR
    public Animal(int weigth, int size) {
        this.weigth = weigth;
        this.size = size;
    }
    //endregion

    //region GETTER SETTER
    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //endregion
}
