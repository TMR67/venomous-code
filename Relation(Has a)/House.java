class House {
    public String owner;
    public int floors;
    public Address address;

    public House(String owner, int floors, Address address) {
        this.owner = owner;
        this.floors = floors;
        this.address = address;
    }

    public void houseDetails() {
        System.out.println("House owned by: " + owner);
        System.out.println("Floors: " + floors);
        System.out.println("Located at: " + address.city + ", " + address.state);
    }
}



