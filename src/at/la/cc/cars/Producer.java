package at.la.cc.cars;

public class Producer {
    public enum BRAND {AUDI, SKODA, MINI};
    private String countryOfOrigin;
    private Producer.BRAND brand;


    public Producer(BRAND brand) {
        this.brand = brand;
    }

    //region GETTER SETTER
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDiscount() {
        if (brand.equals(BRAND.AUDI)){
            return 10;
        }
        if (brand.equals(BRAND.MINI)){
            return 15;
        }
        if (brand.equals(BRAND.SKODA)){
            return  20;
        }return 0;
    }

    public BRAND getBrand() {
        return brand;
    }

    public void setBrand(BRAND brand) {
        this.brand = brand;
    }
    //endregion
}
