/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackkerrank;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
class Person {
    private String name;
    private String dateOfBirth;
    private String id;
 
    public Person(String name, String dateOfBirth, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public String getId() {
        return id;
    }
 
    // Add a person to the list
    public static void addPerson(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        people.add(new Person(name, dateOfBirth, id));
        System.out.println("Person added successfully.");
    }
 
    // Update a person's information
    public static void updatePerson(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the person to update: ");
        String id = scanner.nextLine();
        for (Person person : people) {
            if (person.getId().equals(id)) {
                System.out.println("1. Rename");
                System.out.println("2. Add to Student List");
                System.out.println("3. Add to Teacher List");
                System.out.println("4. Remove from Student List");
                System.out.println("5. Remove from Teacher List");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
 
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        person.name = newName;
                        System.out.println("Name updated successfully.");
                        break;
                    // Add or remove from student/teacher list - Implement as needed
                    // Add or remove logic goes here
                    default:
                        System.out.println("Invalid option.");
                }
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
    }
}
class Course {
    private String courseName;
    private List<Person> students = new ArrayList<>();
    private List<Person> teachers = new ArrayList<>();
 
    public Course(String courseName) {
        this.courseName = courseName;
    }
 
    // Add a student to the course
    public void addStudent(Person student) {
        students.add(student);
    }
 
    // Remove a student from the course
    public void removeStudent(Person student) {
        students.remove(student);
    }
 
    // Add a teacher to the course
    public void addTeacher(Person teacher) {
        teachers.add(teacher);
    }
 
    // Remove a teacher from the course
    public void removeTeacher(Person teacher) {
        teachers.remove(teacher);
    }
 
    // Rename the course
    public void renameCourse(String newName) {
        this.courseName = newName;
    }
 
    public String getCourseName() {
        return courseName;
    }
 
    public List<Person> getStudents() {
        return students;
    }
 
    public List<Person> getTeachers() {
        return teachers;
    }
}
 
class Faculty {
    private List<Course> courses = new ArrayList<>();
 
    // Add a course to the list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }
 
    // Update a course (rename, add/remove students/teachers)
    public void updateCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the course to update: ");
        String courseName = scanner.nextLine();
 
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                System.out.println("1. Rename Course");
                System.out.println("2. Add Student");
                System.out.println("3. Remove Student");
                System.out.println("4. Add Teacher");
                System.out.println("5. Remove Teacher");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
 
                switch (choice) {
                    case 1:
                        System.out.print("Enter new course name: ");
                        String newCourseName = scanner.nextLine();
                        course.renameCourse(newCourseName);
                        System.out.println("Course renamed successfully.");
                        break;
                    case 2:
                        Person.addPerson(course.getStudents());
                        System.out.println("Student added to the course.");
                        break;
                    case 3:
                        // Implement remove student from course logic here
                        break;
                    case 4:
                        // Implement add teacher to course logic here
                        break;
                    case 5:
                        // Implement remove teacher from course logic here
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                return;
            }
        }
        System.out.println("Course with name " + courseName + " not found.");
    }
 
    // View courses for a specific student
    public void viewCoursesForStudent(Person student) {
        System.out.println(student.getName() + "'s Courses:");
        for (Course course : courses) {
            if (course.getStudents().contains(student)) {
                System.out.println(course.getCourseName());
            }
        }
    }
}
 
class Student {
    private List<Course> courses = new ArrayList<>();
 
    // Add a course to the list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }
 
    // Update student information (rename)
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();
 
        for (Course course : courses) {
            if (course.getStudents().stream().anyMatch(student -> student.getId().equals(id))) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                // Update student's name - Implement as needed
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found in any courses.");
    }
 
    // View courses for a specific student
    public void viewCoursesForStudent() {
        // Implement viewCoursesForStudent logic here
    }
}
 
public class RegisterSystem {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        Faculty faculty = new Faculty();
        Student student = new Student();
 
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Person");
            System.out.println("2. Update Person");
            System.out.println("3. Add Course");
            System.out.println("4. Update Course");
            System.out.println("5. Add Student to Course");
            System.out.println("6. Remove Student from Course");
            System.out.println("7. Add Teacher to Course");
            System.out.println("8. Remove Teacher from Course");
            System.out.println("9. View Courses for Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
 
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
 
            switch (choice) {
                case 1:
                    Person.addPerson(people);
                    break;
                case 2:
                    Person.updatePerson(people);
                    break;
                case 3:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    courses.add(new Course(courseName));
                    System.out.println("Course added successfully.");
                    break;
                case 4:
                    faculty.updateCourse();
                    break;
                case 5:
                    // Implement add student to course logic here
                    break;
                case 6:
                    // Implement remove student from course logic here
                    break;
                case 7:
                    // Implement add teacher to course logic here
                    break;
                case 8:
                    // Implement remove teacher from course logic here
                    break;
                case 9:
                    student.viewCoursesForStudent();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
