class Restaurant {
    public void restaurantDisplay(RestaurantMenu[] menu) {
        for (RestaurantMenu data : menu) {
            data.menuDisplay();
        }
    }
}

class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        RestaurantMenu m1 = new RestaurantMenu("Pizza", 150);
        RestaurantMenu m2 = new RestaurantMenu("Burger", 80);
        RestaurantMenu m3 = new RestaurantMenu("Sandwich", 60);
        RestaurantMenu m4 = new RestaurantMenu("Fries", 50);
        RestaurantMenu m5 = new RestaurantMenu("Pasta", 120);

        RestaurantMenu[] menu = {m1, m2, m3, m4, m5};

        restaurant.restaurantDisplay(menu);
    }
}
