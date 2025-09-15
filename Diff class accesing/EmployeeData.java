class EmployeeData{
	public String employeeName;
	public long employeeNumber;
	
	public EmployeeData(String employeeName, long employeeNumber){
		
		
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
	}
	
	public void employeeDisplay(){
		System.out.println(employeeName);
		System.out.println(employeeNumber);
	}
}