import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Task2 {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void showMenu() {
        System.out.println("\n--- Student Record Management ---");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(sc.nextLine());

        students.add(new Student(id, name, marks));
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new marks: ");
                s.marks = Double.parseDouble(sc.nextLine());

                System.out.println("Record updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
