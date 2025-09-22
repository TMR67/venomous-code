class SHIELD {
    public int approximateAgentsCount;
    public Power mainPower;
    public Weapon mainWeapon;
    public Vehicle mainVehicle;

    public SHIELD(int approximateAgentsCount, Power mainPower, Weapon mainWeapon, Vehicle mainVehicle) {
        this.approximateAgentsCount = approximateAgentsCount;
        this.mainPower = mainPower;
        this.mainWeapon = mainWeapon;
        this.mainVehicle = mainVehicle;
    }

    public void displaySHIELDDetails() {
        System.out.println("Approximate Active S.H.I.E.L.D. Agents: " + approximateAgentsCount);
        System.out.println("Most Prominent Power: " + mainPower.mainPower);
        System.out.println("Most Prominent Weapon: " + mainWeapon.mainWeapon);
        System.out.println("Commonly Used Vehicle: " + mainVehicle.mainVehicle);
    }
}