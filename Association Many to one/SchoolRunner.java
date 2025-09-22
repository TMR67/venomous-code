class SchoolRunner {
    public static void main(String[] args) {
        Student student = new Student("Sanjay", "10th Grade");
        Teacher teacher = new Teacher("Mr.Manu");
        Course course = new Course("Mathematics", 4);
        School school = new School("Govt High School", student, teacher, course);

        school.schoolDetails();
    }
}