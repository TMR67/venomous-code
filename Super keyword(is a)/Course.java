class Animal {
    public String species;
    public double weightKg;
    public long animalId;
    public float bodyTempCelsius;
    public boolean isNocturnal;
    public char diet; 
    public int lifespanYears; 
}
class Cat extends Animal {
    public String breed;
    public String ownerName;
    public int ageYears;
    public float cutenessLevel;
    public long microchipId;
    public boolean isIndoor;
    public char furColor;

    public Cat(String species, double weightKg, long animalId,
               float bodyTempCelsius, boolean isNocturnal, char diet,
               int lifespanYears,
               String breed, String ownerName, int ageYears,
               float cutenessLevel, long microchipId, boolean isIndoor, char furColor) {

        super.species = species;
        super.weightKg = weightKg;
        super.animalId = animalId;
        super.bodyTempCelsius = bodyTempCelsius;
        super.isNocturnal = isNocturnal;
        super.diet = diet;
        super.lifespanYears = lifespanYears;
        
        this.breed = breed;
        this.ownerName = ownerName;
        this.ageYears = ageYears;
        this.cutenessLevel = cutenessLevel;
        this.microchipId = microchipId;
        this.isIndoor = isIndoor;
        this.furColor = furColor;
    }
    
    public void displayCat() {
        System.out.println("Species: " + super.species + " | Breed: " + this.breed);
        System.out.println("Weight: " + super.weightKg + " kg | Age: " + this.ageYears + " years");
        System.out.println("Lifespan: " + super.lifespanYears + " years | Diet: " + super.diet);
        System.out.println("Owner: " + this.ownerName + " | Is Indoor: " + this.isIndoor);
    }
}

class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat("Felis catus", 4.5, 555L, 38.0f, true, 'C',
                            15,
                            "Siamese", "John Doe", 3,
                            9.5f, 987654321L, true, 'T');
        myCat.displayCat();
    }
}