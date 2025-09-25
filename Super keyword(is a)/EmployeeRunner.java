class EmployeeRunner {
    public static void main(String[] args) {
        Manager myManager = new Manager("Alice Smith", 101, 95000.0, true, "Engineering", 1234567890L, 'S',
                                        15, "Project Orion", 10000.0, true, 201L, 4.5f, 'T');
        myManager.displayManager();
    }
}