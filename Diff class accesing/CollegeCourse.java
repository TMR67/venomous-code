class CollegeCourse {
    public String courseName;
    public int courseCode;

    public CollegeCourse(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void courseDisplay() {
        System.out.println(courseName);
        System.out.println(courseCode);
    }
}
