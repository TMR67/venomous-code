public class MCURunner {
    public static void main(String[] args) {
        Power avengersPower = new Power("Super Strength", "Flight");
        Weapon avengersWeapon = new Weapon("Mjolnir/Stormbreaker", "Iron Man's Suit");
        Vehicle avengersVehicle = new Vehicle("Quinjet", "Hulk's Jump");
        TheAvengers theAvengers = new TheAvengers(7, avengersPower, avengersWeapon, avengersVehicle);
        
		Power guardiansPower = new Power("Cosmic Blasts", "Regeneration");
        Weapon guardiansWeapon = new Weapon("Laser Guns", "Groot's Branches");
        Vehicle guardiansVehicle = new Vehicle("Benatar", "Milano");
        GuardiansOfTheGalaxy guardians = new GuardiansOfTheGalaxy(5, guardiansPower, guardiansWeapon, guardiansVehicle);

        Power shieldPower = new Power("Espionage", "Advanced Technology");
        Weapon shieldWeapon = new Weapon("Pistols", "Submachine Guns");
        Vehicle shieldVehicle = new Vehicle("Helicarrier", "Flying Cars");
		SHIELD shield = new SHIELD(100, shieldPower, shieldWeapon, shieldVehicle);

     shield.displaySHIELDDetails();
	 guardians.displayGuardiansDetails();
	 theAvengers.displayAvengersDetails();
    }
}