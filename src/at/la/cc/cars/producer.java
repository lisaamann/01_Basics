package at.la.cc.cars;

import java.util.List;

public class producer {
    public enum BRAND {AUDI, SKODA, MINI};
    private String countryOfOrigin;
    private int discountPerBrand;
    private producer.BRAND brand;

    public producer(BRAND brand) {
        this.brand = brand;
    }

    public producer() {
    }

    //METHODEN

    public int discountPerBrand(int discount){
        if (brand.equals(BRAND.AUDI)){
            discount = 10;
        }
        if (brand.equals(BRAND.MINI)){
            discount = 15;
        }
        if (brand.equals(BRAND.SKODA)){
            discount = 20;
        }return discount;
    }

    //region GETTER SETTER
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDiscountPerBrand() {
        return discountPerBrand;
    }

    public void setDiscountPerBrand(int discountPerBrand) {
        this.discountPerBrand = discountPerBrand;
    }

    public BRAND getBrand() {
        return brand;
    }

    public void setBrand(BRAND brand) {
        this.brand = brand;
    }
    //endregion
}
