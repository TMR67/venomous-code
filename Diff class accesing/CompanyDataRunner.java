class CompanyDataRunner{
	public static void main(String [] args){
		
		CompanyData companyData=new CompanyData();
		
		EmployeeData firstEmployeeData=new EmployeeData("Prasad",6360211265l);
		EmployeeData secondEmployeeData=new EmployeeData("Alphin",9845678634l);
		EmployeeData thirdEmployeeData=new EmployeeData("Kumar",7865983452l);
		EmployeeData fourthEmployeeData=new EmployeeData("Vishnu",9988647983l);
		EmployeeData fifthEmployeeData=new EmployeeData("Chetan",8745230845l);
		
		EmployeeData [] employeeData={firstEmployeeData,secondEmployeeData,thirdEmployeeData,
		                               fourthEmployeeData,fifthEmployeeData};
		
		
		companyData.companyDisplay(employeeData);
		
	}
}