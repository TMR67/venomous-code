class CricketTeamsRunner {
    public static void main(String[] args) {
        BattingOrder testBatting = new BattingOrder("Rohit Sharma, Yashasvi Jaiswal", "Virat Kohli, Ajinkya Rahane");
        BowlingAttack testBowling = new BowlingAttack("Jasprit Bumrah, Mohammed Shami", "Ravichandran Ashwin, Ravindra Jadeja");
        FieldingKit testKit = new FieldingKit("Puma", "Shrey");
        TestTeam indianTestTeam = new TestTeam("Indian Cricket Team", testBatting, testBowling, testKit);

        BattingOrder odiBatting = new BattingOrder("Rohit Sharma, Shubman Gill", "Virat Kohli, Shreyas Iyer");
        BowlingAttack odiBowling = new BowlingAttack("Jasprit Bumrah, Mohammed Siraj", "Kuldeep Yadav, Ravindra Jadeja");
        FieldingKit odiKit = new FieldingKit("Adidas", "Kookaburra");
        ODITeam indianODITeam = new ODITeam("Indian Cricket Team", odiBatting, odiBowling, odiKit);

        BattingOrder t20Batting = new BattingOrder("Ruturaj Gaikwad, Shubman Gill", "Suryakumar Yadav, Hardik Pandya");
        BowlingAttack t20Bowling = new BowlingAttack("Arshdeep Singh, Jasprit Bumrah", "Kuldeep Yadav, Yuzvendra Chahal");
        FieldingKit t20Kit = new FieldingKit("GM", "Masuri");
        T20Team indianT20Team = new T20Team("Indian Cricket Team", t20Batting, t20Bowling, t20Kit);
        
        indianTestTeam.displayDetails();
        indianODITeam.displayDetails();
        indianT20Team.displayDetails();
    }
}