package at.la.cc.carConfiguration;

public class Producer {
    public enum BRAND {MINI, VW, SKODA};
    private Producer.BRAND brand;

    //region CONSTRUCTOR
    public Producer(BRAND brand) {
        this.brand = brand;
    }
    //endregion

    public int getDiscount() {
        if (brand.equals(BRAND.MINI)){
            return 10;
        }
        if (brand.equals(BRAND.VW)){
            return 15;
        }
        if (brand.equals(BRAND.SKODA)){
            return  20;
        }return 0;
    }

    //region GETTER SETTER
    public BRAND getBrand() {
        return brand;
    }

    public void setBrand(BRAND brand) {
        this.brand = brand;
    }

    //endregion


    @Override
    public String toString() {
        return "" +
                brand
                ;
    }
}
