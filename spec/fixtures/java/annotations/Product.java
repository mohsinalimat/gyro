package fr.ganfra.realm;

import io.realm.RealmObject;

/* DO NOT EDIT | Generated by dbgenerator */

public class Product extends RealmObject {

    public interface Attributes {
        String BRAND = "brand";
        String NAME = "name";
        String PRICE = "price";
    }

    private String brand;
    private String name;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
