package com.fasttrack.restaurant;

public class Restaurant {
    private final String name;
    private final String city;
    private final RestaurantType type;
    private final int rating;

    public Restaurant(String name, String city, RestaurantType type, int rating) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public RestaurantType getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                '}';
    }
}
