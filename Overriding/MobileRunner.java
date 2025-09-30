class MobileRunner {
	public static void main(String [] args) {
		
		SmartPhone myPhone = new SmartPhone();

		myPhone.displaySpec("Samsung"); 
		
		myPhone.displaySpec(8); 
		
		myPhone.displaySpec(987654321098765L);
		
		myPhone.displaySpec(6.7f);
		
		myPhone.displaySpec(899.99d);
		
		myPhone.displayCameraMP('H'); 
		
		myPhone.displayBiometric(true);
	}
}