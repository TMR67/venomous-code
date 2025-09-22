class PG {
    public String pgName;
    public Room room;
    public Owner owner;
    public Food food;

    public PG(String pgName, Room room, Owner owner, Food food) {
        this.pgName = pgName;
        this.room = room;
        this.owner = owner;
        this.food = food;
    }

    public void pgDetails() {
        System.out.println("PG Name: " + pgName);
        System.out.println("Room number: " + room.roomNumber+" And Room is Air-Conditioned " + room.isAC);
        System.out.println("Owner Name: " + owner.name);
        System.out.println("Food package: " + food.packageType);
        System.out.println("Food price per month: $" + food.monthlyPrice);
    }
}







