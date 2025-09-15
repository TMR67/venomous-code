class StoresRunner{
	public static void main(String [] args){
		
		Stores stores=new Stores();
		
		Mall firstMallInfo=new Mall("lulu",102);
		Mall secondMallInfo=new Mall("GT",168);
		Mall thirdMallInfo=new Mall("Garuda",109);
		Mall fourthMallInfo=new Mall("Galary",128);
		Mall fifthMallInfo=new Mall("Finix",233);
		
		Mall[] mallInfo={firstMallInfo,secondMallInfo,thirdMallInfo,
		                     fourthMallInfo,fifthMallInfo};
		
		stores.storesDisplay(mallInfo);
	}
}