import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }


    // View Students
    public void viewStudents() {

        if(students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for(Student s : students) {
            s.displayStudent();
        }
    }


    // Search Student
    public Student searchStudent(int id) {

        for(Student s : students) {
            if(s.getId() == id) {
                return s;
            }
        }

        return null;
    }


    // Delete Student
    public void deleteStudent(int id) {

        Student student = searchStudent(id);

        if(student != null) {
            students.remove(student);
            System.out.println("Student deleted!");
        }
        else {
            System.out.println("Student not found!");
        }
    }


    // Update Student
    public void updateStudent(int id, String name, double marks) {

        Student student = searchStudent(id);

        if(student != null) {
            student.setName(name);
            student.setMarks(marks);
            System.out.println("Student updated!");
        }
        else {
            System.out.println("Student not found!");
        }
    }
}