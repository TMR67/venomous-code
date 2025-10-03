class Thunder{

public String ownerName;
public String gameName;
public PlayStation playStation;
public Xbox xbox;

public Thunder(String ownerName,String gameName,PlayStation playStation,Xbox xbox){

this.ownerName=ownerName;
this.gameName=gameName;
this.playStation=playStation;
this.xbox=xbox;
}
public void thunderDetails(){

System.out.println("Owner Of Thunder Club is "+ownerName);
System.out.println("Here they play "+gameName);
System.out.println("They also use PS% that is from "+playStation.brandFrom);
System.out.println("And also "+xbox.newVersion);

}

}