class School {
    public String schoolName;
    public Student student;
    public Teacher teacher;
    public Subject subject;
    public Classroom classroom;

    public School(String schoolName, Student student, Teacher teacher, Subject subject, Classroom classroom) {
        this.schoolName = schoolName;
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
        this.classroom = classroom;
    }

    public void displaySchoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Student: " + student.studentName + " (ID: " + student.studentID + ")");
        System.out.println("Teacher: " + teacher.teacherName + " (Specialty: " + teacher.specialty + ")");
        System.out.println("Subject: " + subject.subjectName + " (" + subject.classHours + " hours/week)");
        System.out.println("Classroom: Room " + classroom.roomNumber + " (Capacity: " + classroom.capacity + ")");
    }
}
