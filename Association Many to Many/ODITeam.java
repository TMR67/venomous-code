class ODITeam {
    public String teamName;
    public BattingOrder battingOrder;
    public BowlingAttack bowlingAttack;
    public FieldingKit fieldingKit;

    public ODITeam(String teamName, BattingOrder battingOrder, BowlingAttack bowlingAttack, FieldingKit fieldingKit) {
        this.teamName = teamName;
        this.battingOrder = battingOrder;
        this.bowlingAttack = bowlingAttack;
        this.fieldingKit = fieldingKit;
    }

    public void displayDetails() {
        System.out.println("Team Type: ODI Cricket");
        System.out.println("Team Name: " + teamName);
        System.out.println("Top Order Batsmen: " + battingOrder.topOrderBatsmen);
        System.out.println("Main Spin Bowlers: " + bowlingAttack.spinBowlers);
        System.out.println("Helmet Brand: " + fieldingKit.helmetBrand);
    }
}