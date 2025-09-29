class SchoolRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 101);
        Teacher teacher1 = new Teacher("Mr. Smith", "Computer Science");
        Subject subject1 = new Subject("Java Programming", 5);
        Classroom room1 = new Classroom(205, 30);
        School highSchool = new School("Central High School", student1, teacher1, subject1, room1);

        highSchool.displaySchoolDetails();
    }
}