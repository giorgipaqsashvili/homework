public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];


        students[0] = new Student("John", "Doe", 20, 3, 3.8);
        students[1] = new Student("Jane", "Smith", 22, 2, 3.5);
        students[2] = new Student("Alex", "Johnson", 21, 1, 4.0);
        students[3] = new Student("Emily", "Davis", 23, 4, 3.7);
        students[4] = new Student("Michael", "Brown", 19, 1, 3.2);


        for (Student student : students) {
            student.printStudentDetails();
        }


        String topStudent = findTopStudent(students);
        System.out.println("The student with the highest GPA is: " + topStudent);
    }


    public static String findTopStudent(Student[] students) {
        Student topStudent = students[0];

        for (Student student : students) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        
        return topStudent.getFirstName() + " " + topStudent.getLastName();
    }
}