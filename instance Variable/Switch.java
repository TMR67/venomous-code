class Switch{
public int noOfSwitches = 10;
public String brandName = "GM";
public char ratingOfSwitch = 'A';
public boolean itsOn = true;
public float voltage = 6.3246f;
public double amp = 23.7654;
public long totalProduct = 7654323456l;

public void displaySwitch(){
	

System.out.println("Total switches in room is "+noOfSwitches);
System.out.println("Brand used is "+brandName);
System.out.println("Grade of that switch is "+ratingOfSwitch);
System.out.println("Is it on "+itsOn);
System.out.println("voltage ="+voltage);
System.out.println("Amp ="+amp);
System.out.println("Manufactured products ="+totalProduct);
	
}

}