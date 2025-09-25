class Manager extends Employee {
    public int teamSize;
    public String projectManaged;
    public double bonus;
    public boolean hasBudgetAuthority;
    public long managerId;
    public float performanceRating;
    public char managementLevel;

    public Manager(String name, int employeeId, double salary, boolean isFullTime,
                   String department, long contactNumber, char employeeType,
                   int teamSize, String projectManaged, double bonus,
                   boolean hasBudgetAuthority, long managerId, float performanceRating,
                   char managementLevel) {
        
        super.name = name;
        super.employeeId = employeeId;
        super.salary = salary;
        super.isFullTime = isFullTime;
        super.department = department;
        super.contactNumber = contactNumber;
        super.employeeType = employeeType;

        this.teamSize = teamSize;
        this.projectManaged = projectManaged;
        this.bonus = bonus;
        this.hasBudgetAuthority = hasBudgetAuthority;
        this.managerId = managerId;
        this.performanceRating = performanceRating;
        this.managementLevel = managementLevel;
    }
    
    public void displayManager() {
        System.out.println("Name: " + super.name + " | Employee ID: " + super.employeeId);
        System.out.println("Department: " + super.department + " | Salary: $" + super.salary);
        System.out.println("Team Size: " + this.teamSize + " | Project Managed: " + this.projectManaged);
        System.out.println("Bonus: $" + this.bonus + " | Performance Rating: " + this.performanceRating);
        System.out.println("Management Level: " + this.managementLevel);
    }
}
