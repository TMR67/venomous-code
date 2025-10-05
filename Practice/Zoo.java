class Zoo {
    
    public void zooDisplay(Animal[] animals) {

        System.out.println("--- Zoo Roster ---");
        for (int zooo = 0; zooo < animals.length; zooo++) {
            Animal animalDetails = animals[zooo];
            System.out.println("\nEnclosure " + (zooo + 1) + ":");
            animalDetails.animalDisplay();
        }
    }
}