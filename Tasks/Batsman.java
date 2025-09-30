class Batsman extends Game {

    public int playerAge;
    public String playerName;
    public float playerHeight;
    public long playerContactNumber;
    public double playerSalary;
    public char playerHandedness;
    public boolean isInternationalPlayer;

    public Batsman() {
        System.out.println("this non argument constructor (Batsman)");
    }

    public Batsman(int playerAge, String playerName, float playerHeight, long playerContactNumber, double playerSalary, char playerHandedness, boolean isInternationalPlayer) {
        super();

        super.playerAge = playerAge;
        super.playerName = playerName;
        super.playerHeight = playerHeight;
        super.playerContactNumber = playerContactNumber;
        super.playerSalary = playerSalary;
        super.playerHandedness = playerHandedness;
        super.isInternationalPlayer = isInternationalPlayer;

        this.playerAge = playerAge;
        this.playerName = playerName;
        this.playerHeight = playerHeight;
        this.playerContactNumber = playerContactNumber;
        this.playerSalary = playerSalary;
        this.playerHandedness = playerHandedness;
        this.isInternationalPlayer = isInternationalPlayer;
    }

    public void displayBatsman() {
        System.out.println("--- Batsman Details ---");
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Player Age: " + this.playerAge);
        System.out.println("Player Height: " + this.playerHeight + "m");
        System.out.println("Player Contact Number: " + this.playerContactNumber);
        System.out.println("Player Salary: " + this.playerSalary);
        System.out.println("Player Handedness: " + this.playerHandedness);
        System.out.println("Is International Player: " + this.isInternationalPlayer);
    }
}