class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        RestaurantMenu menu1 = new RestaurantMenu("Pizza", 150);
        RestaurantMenu menu2 = new RestaurantMenu("Burger", 80);
        RestaurantMenu menu3 = new RestaurantMenu("Sandwich", 60);
        RestaurantMenu menu4 = new RestaurantMenu("Fries", 50);
        RestaurantMenu menu5 = new RestaurantMenu("Pasta", 120);

        RestaurantMenu[] menu = {menu1, menu2, menu3, menu4, menu5};

        restaurant.restaurantDisplay(menu);
    }
}
