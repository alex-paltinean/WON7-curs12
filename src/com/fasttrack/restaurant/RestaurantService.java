package com.fasttrack.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {
    private final List<Restaurant> restaurants;

    public RestaurantService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    List<Restaurant> getRestaurantsFromCity(String city) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (city == null || restaurant.getCity().equals(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    List<Restaurant> getRestaurantsOfType(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getType() == type) {
                result.add(restaurant);
            }
        }
        return result;
    }

    Map<String, String> mapRestaurantToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    Map<String, List<Restaurant>> groupByCity() {
        Map<String, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<Restaurant> cityRestaurants = result.get(restaurant.getCity());
            if (cityRestaurants == null) {
                cityRestaurants = new ArrayList<>();
                result.put(restaurant.getCity(), cityRestaurants);
            }
            cityRestaurants.add(restaurant);
        }
        return result;
    }

    Restaurant getFromCityOfTypeWithMaxRating(String city, RestaurantType type) {
        int maxRating = Integer.MIN_VALUE;
        Restaurant result = null;
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getCity().equals(city) && restaurant.getType() == type) {
                if (restaurant.getRating() > maxRating) {
                    maxRating = restaurant.getRating();
                    result = restaurant;
                }
            }
        }
        return result;
    }
}
