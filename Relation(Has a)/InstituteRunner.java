class InstituteRunner {
    public static void main(String[] args) {
        Course course1 = new Course("Data Science Fundamentals", 16);
        
        Institute techInstitute = new Institute("Tech Training Center", "California", course1);
        
        techInstitute.displayInstituteDetails();
    }
}