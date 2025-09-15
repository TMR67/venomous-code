class ApartmentRunner{
	public static void main(String [] args){
		Apartment apartment=new Apartment();
		
		Floors floorsOne=new Floors(101,"akg");
		Floors floorsTwo=new Floors(102,"skg");
		Floors floorsThree=new Floors(103,"dkg");
		Floors floorsFour=new Floors(104,"fkg");
		
		
		Floors [] floors={floorsOne,floorsTwo,floorsThree,floorsFour};
		
		
		apartment.apartmentDisplay(floors);
		
	}
}