class University {
    
    public void universityDisplay(Department[] departments) {

        System.out.println("--- University Departments Roster ---");
        for (int univer = 0; univer < departments.length; univer++) {
            Department deptDetails = departments[univer];
            System.out.println("\nDepartment " + (univer + 1) + ":");
            deptDetails.departmentDisplay();
        }
    }
}