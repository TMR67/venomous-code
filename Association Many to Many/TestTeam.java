class TestTeam {
    public String teamName;
    public BattingOrder battingOrder;
    public BowlingAttack bowlingAttack;
    public FieldingKit fieldingKit;

    public TestTeam(String teamName, BattingOrder battingOrder, BowlingAttack bowlingAttack, FieldingKit fieldingKit) {
        this.teamName = teamName;
        this.battingOrder = battingOrder;
        this.bowlingAttack = bowlingAttack;
        this.fieldingKit = fieldingKit;
    }

    public void displayDetails() {
        System.out.println("Team Type: Test Cricket");
        System.out.println("Team Name: " + teamName);
        System.out.println("Top Order Batsmen: " + battingOrder.topOrderBatsmen);
        System.out.println("Main Pace Bowlers: " + bowlingAttack.paceBowlers);
        System.out.println("Wicket-keeping Gloves: " + fieldingKit.wicketKeepingGloves);
    }
}