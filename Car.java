package org.example;

public class Car {

    private String name;
    private String country;
    private String type;

    public Car(String name, String country, String type) {
        this.name = name;
        this.country = country;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + country + ", " + type + ")";
    }
}
