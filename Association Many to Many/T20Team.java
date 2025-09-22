class T20Team {
    public String teamName;
    public BattingOrder battingOrder;
    public BowlingAttack bowlingAttack;
    public FieldingKit fieldingKit;

    public T20Team(String teamName, BattingOrder battingOrder, BowlingAttack bowlingAttack, FieldingKit fieldingKit) {
        this.teamName = teamName;
        this.battingOrder = battingOrder;
        this.bowlingAttack = bowlingAttack;
        this.fieldingKit = fieldingKit;
    }

    public void displayDetails() {
        System.out.println("Team Type: T20 Cricket");
        System.out.println("Team Name: " + teamName);
        System.out.println("Middle Order Batsmen: " + battingOrder.middleOrderBatsmen);
        System.out.println("Main Spin Bowlers: " + bowlingAttack.spinBowlers);
        System.out.println("Wicket-keeping Gloves: " + fieldingKit.wicketKeepingGloves);
    }
}