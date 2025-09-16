class CollegeRunner {
    public static void main(String[] args) {
        College college = new College();

        CollegeCourse course1 = new CollegeCourse("Computer Science", 501);
        CollegeCourse course2 = new CollegeCourse("Mechanical", 502);
        CollegeCourse course3 = new CollegeCourse("Electrical", 503);
        CollegeCourse course4 = new CollegeCourse("Civil", 504);
        CollegeCourse course5 = new CollegeCourse("Electronics", 505);

          CollegeCourse[] courses = {course1, course2, course3, course4, course5};

        college.collegeDisplay(courses);
    }
}