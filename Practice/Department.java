class Department {

    public String deptName;
    public int studentCapacity;

    public Department(String deptName, int studentCapacity) {
        this.deptName = deptName;
        this.studentCapacity = studentCapacity;
    }

    public void departmentDisplay() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Capacity: " + studentCapacity + " students");
    }
}
