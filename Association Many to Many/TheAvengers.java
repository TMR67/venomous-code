class TheAvengers {
    public int approximateMembersCount;
    public Power mainPower;
    public Weapon mainWeapon;
    public Vehicle mainVehicle;

    public TheAvengers(int approximateMembersCount, Power mainPower, Weapon mainWeapon, Vehicle mainVehicle) {
        this.approximateMembersCount = approximateMembersCount;
        this.mainPower = mainPower;
        this.mainWeapon = mainWeapon;
        this.mainVehicle = mainVehicle;
    }

    public void displayAvengersDetails() {
        System.out.println("Approximate Active Avengers Members: " + approximateMembersCount);
        System.out.println("Most Prominent Power: " + mainPower.mainPower);
        System.out.println("Most Prominent Weapon: " + mainWeapon.mainWeapon);
        System.out.println("Commonly Used Vehicle: " + mainVehicle.mainVehicle);
    }
}