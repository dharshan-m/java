import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int studentID;

    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("John", 20, 101);
        student1.displayStudent();

        System.out.println("Enter new name for student:");
        String newName = scanner.nextLine();
        student1.setName(newName);

        System.out.println("Enter new age for student:");
        int newAge = scanner.nextInt();
        student1.setAge(newAge);

        student1.displayStudent();

        scanner.close();
    }
}
