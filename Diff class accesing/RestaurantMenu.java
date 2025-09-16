class RestaurantMenu {
    public String itemName;
    public int itemPrice;

    public RestaurantMenu(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void menuDisplay() {
        System.out.println(itemName);
        System.out.println(itemPrice);
    }
}