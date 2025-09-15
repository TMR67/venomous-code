class Bikes{
	public String bikeNames;
	public double BikePrice;
	
	public Bikes(String bikeNames,double BikePrice){
		
		this.bikeNames=bikeNames;
		this.BikePrice=BikePrice;
	}
	
	public void bikeDisplay(){
		System.out.println(bikeNames);
		System.out.println(BikePrice);
	}
}