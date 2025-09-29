class Cat extends Animal {

    public int animalAge;
    public String animalName;
    public float animalHeight;
    public long animalOwnerNumber;
    public double animalPrice;
    public char animalGender;
    public boolean isPetAnimal;


    public Cat() {
        System.out.println("this non argument constructor");
    }

    public Cat(int animalAge, String animalName, float animalHeight, long animalOwnerNumber, double animalPrice, char animalGender, boolean isPetAnimal) {
        super();
        super.animalAge = animalAge;
        super.animalName = animalName;
        super.animalHeight = animalHeight;
        super.animalOwnerNumber = animalOwnerNumber;
        super.animalPrice = animalPrice;
        super.animalGender = animalGender;
        super.isPetAnimal = isPetAnimal;

        this.animalAge = animalAge;
        this.animalName = animalName;
        this.animalHeight = animalHeight;
        this.animalOwnerNumber = animalOwnerNumber;
        this.animalPrice = animalPrice;
        this.animalGender = animalGender;
        this.isPetAnimal = isPetAnimal;
    }

    public void displayCat() {
        System.out.println("animal Age==" + this.animalAge);
        System.out.println("animal name==" + this.animalName);
        System.out.println("animal Height==" + this.animalHeight);
        System.out.println("animal owner number==" + this.animalOwnerNumber);
        System.out.println("animal price==" + this.animalPrice);
        System.out.println("animal gender==" + this.animalGender);
        System.out.println("it is a pet==" + this.isPetAnimal);
    }
}