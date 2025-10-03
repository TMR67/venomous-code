class  Wolfpack{


public String gameName;
public int noOfPlayers;
public PlayStation playStation;
public Xbox xbox;

public Wolfpack(String gameName,int noOfPlayers,PlayStation playStation,Xbox xbox){

this.gameName=gameName;
this.noOfPlayers=noOfPlayers;
this.playStation=playStation;
this.xbox=xbox;
}
public void displayWolfpackDetails(){

System.out.println("This is about Wolfpack");
System.out.println("They play:"+gameName);
System.out.println("Here there is "+noOfPlayers+" gamers");
System.out.println("Some of them use PS5 that is from "+playStation.brandFrom+" and that costs "+playStation.price);
System.out.println("Others use "+xbox.newVersion+" and this costs "+xbox.price);

}

}