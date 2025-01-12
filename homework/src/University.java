public class University {
    private String universityName;
    private boolean isStateUniversity;
    private int numberOfFaculties;

    public University(String universityName, boolean isStateUniversity, int numberOfFaculties) {
        this.universityName = universityName;
        this.isStateUniversity = isStateUniversity;
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printUniversityInfo() {
        System.out.println("University Name: " + universityName);
        System.out.println("State University: " + (isStateUniversity ? "Yes" : "No"));
        System.out.println("Number of Faculties: " + numberOfFaculties);
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String personalNumber;
        private double averageGradePoint;
        private int course;

        public Student(String firstName, String lastName, int age, String personalNumber, double averageGradePoint, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalNumber = personalNumber;
            this.averageGradePoint = averageGradePoint;
            this.course = course;
        }

        public void printStudentInfo() {
            System.out.println("Student Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Personal Number: " + personalNumber);
            System.out.println("Average Grade Point: " + averageGradePoint);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        University university = new University("sulakauri an rame idk", true, 5);
        University.Student student = university.new Student("koba", "axvledianidze", 20, "123456789", 3.75, 2);

        university.printUniversityInfo();

        student.printStudentInfo();
    }
}
