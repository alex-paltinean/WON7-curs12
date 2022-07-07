package com.fasttrack.restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
                new Restaurant("KFC", "Oradea", RestaurantType.FUSION, 3),
                new Restaurant("Pizza Hut", "Cluj Napoca", RestaurantType.MEDITERANEEAN, 4),
                new Restaurant("Marty", "Oradea", RestaurantType.GREEK, 5),
                new Restaurant("Mesopotamia", "Oradea", RestaurantType.FUSION, 4)
        ));

        System.out.println(restaurantService.getRestaurantsFromCity("Oradea"));
        System.out.println(restaurantService.getRestaurantsFromCity(null));

        System.out.println(restaurantService.getRestaurantsOfType(RestaurantType.GREEK));
        System.out.println(restaurantService.getRestaurantsOfType(null));

        System.out.println(restaurantService.mapRestaurantToCity());

        System.out.println(restaurantService.groupByCity());

        System.out.println(restaurantService.getFromCityOfTypeWithMaxRating("Oradea", RestaurantType.FUSION));
    }
}
