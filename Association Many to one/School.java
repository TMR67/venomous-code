class School {
    public String schoolName;
    public Student student;
    public Teacher teacher;
    public Course course;

    public School(String schoolName, Student student, Teacher teacher, Course course) {
        this.schoolName = schoolName;
        this.student = student;
        this.teacher = teacher;
        this.course = course;
    }

    public void schoolDetails() {
        System.out.println("Name of the school is " + schoolName);
        System.out.println("Main student is " + student.studentName + " from class " + student.studentClass);
        System.out.println("The teacher is " + teacher.teacherName);
        System.out.println("They are teaching " + course.courseName + " which has " + course.credits + " credits");
    }
}







