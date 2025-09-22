class PGRunner {
    public static void main(String[] args) {
        Room pgRoom = new Room(101, true);
        Owner pgOwner = new Owner("Mr.Sanjay");
        Food pgFood = new Food("Premium", 2500.00);

        PG myPG = new PG("Surya PG ", pgRoom, pgOwner, pgFood);

        myPG.pgDetails();
    }
}