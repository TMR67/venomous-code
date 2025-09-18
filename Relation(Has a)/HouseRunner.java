class HouseRunner {
    public static void main(String[] args) {
        Address address = new Address("Bangalore", "Karnataka");
        House house = new House("Ramesh", 3, address);
        house.houseDetails();
    }
}
