class ECommerce{
	public String eCommerceName;
	public char eCommerceGrade;
	
	public ECommerce( String eCommerceName, char eCommerceGrade){
		
		this.eCommerceName=eCommerceName;
		this.eCommerceGrade=eCommerceGrade;
		
	}
	
	public void eCommerceDisplay(){
		System.out.println(eCommerceName);
		System.out.println(eCommerceGrade);
	}
}