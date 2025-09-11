class Sim{
public int simNo = 123;
public String simName="Jio";
public char simGrade='A';
public boolean simExistence=true;
public float serialN0=65.43554376f;
public long number=8765466543l;
public double simLength=0.234134;

public int SimNumber(){
	
	System.out.println("No Given to sim = "+simNo);
	
	return simNo;
}
public String nameOfSim(){
 System.out.println("Sim Name"+simName);
return simName; 
}
public char rating(){
	System.out.println("Sim grade= "+simGrade);
	return simGrade;
}
public boolean existence(){
	System.out.println("Sim existence = "+simExistence);
	return simExistence;
}
public float seial(){
	System.out.println("Sim serial= "+serialN0);
	
	return serialN0;
}
public long simNumber(){
	System.out.println("Sim Number= "+number);
	return number;
}
public double length(){
	System.out.println("Sim length= "+simLength);
	return simLength;
}
}