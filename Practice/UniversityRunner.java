class UniversityRunner {
    public static void main(String[] args) {
        University techU = new University();

        Department deptOne = new Department("Computer Science", 500);
        Department deptTwo = new Department("Mechanical Engineering", 450);
        Department deptThree = new Department("Physics", 300);
        Department deptFour = new Department("History", 200);

        Department[] departments = {deptOne, deptTwo, deptThree, deptFour};

        techU.universityDisplay(departments);
    }
}