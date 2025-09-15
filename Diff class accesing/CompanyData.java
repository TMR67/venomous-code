class CompanyData{
	
	public void companyDisplay(EmployeeData[] employeeData){
		
		for (int detail=0; detail<employeeData.length; detail++){
			EmployeeData data=employeeData[detail];
			data.employeeDisplay();
		}
		
		
	}
	
}