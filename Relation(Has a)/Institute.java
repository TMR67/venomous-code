class Institute {
    public String instituteName;
    public String location;
    public Course course;

    public Institute(String instituteName, String location, Course course) {
        this.instituteName = instituteName;
        this.location = location;
        this.course = course;
    }

    public void displayInstituteDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Location: " + location);
        
        System.out.println("Main Course: " + course.courseTitle);
        System.out.println("Duration: " + course.durationWeeks + " weeks");
    }
}