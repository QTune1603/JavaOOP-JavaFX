
package ex4;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.util.*;
import static java.nio.file.Files.createFile;
import static java.nio.file.Files.setLastModifiedTime;
class Person {
    String id, phone;
    Name name;
    Address address;
    public Person (String id, String phone, Name name, Address address) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }
    public static Person setPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input middle name: ");
        String midName = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();
        Name name = new Name(firstName, midName, lastName);
        System.out.println("Home number: ");
        String homeNumber = scanner.nextLine();
        System.out.println("Street: ");
        String street = scanner.nextLine();
        System.out.println("District: ");
        String district = scanner.nextLine();
        System.out.println("City: ");
        String city = scanner.nextLine();
        Address address = new Address(homeNumber, street, district, city);
        return new Person(id, phone, name, address);
    }
}
class Student extends Person {
    String className;
    List<String> courseID;
    public Student (String id, String phone, Name name, Address address,
                    String className) {
        super(id, phone, name, address);
        this.className = className;
        this.courseID = new ArrayList<>();
    }
    void addCourse (Course course) {
        courseID.add(course.id);
    }
    public static Student setStudent() {
        Scanner scanner = new Scanner(System.in);
        Person person = setPerson();
        System.out.println("className: ");
        String className = scanner.nextLine();
        return new Student(person.id, person.phone, person.name,
                person.address, className);
    }
}
class Faculty extends Person {
    String job;
    List<String> courseID;
    public Faculty (String id, String phone, Name name, Address address,
                    String job) {
        super(id, phone, name, address);
        this.job = job;
        this.courseID = new ArrayList<>();
    }
    public void addCourse(Course course) {
        courseID.add(course.id);
    }
    public static Faculty setFaculty () {
        Scanner sc = new Scanner(System.in);
        Person person = setPerson();
        System.out.println("Job: ");
        String job = sc.nextLine();
        return new Faculty(person.id, person.phone, person.name,
                person.address, job);
    }
}
class Course {
    String id, name;
    int credit;
    List<String> StudentID;
    List<String> FacultyID;
    public Course(String id, String name, Integer credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.StudentID = new ArrayList<>();
        this.FacultyID = new ArrayList<>();
    }
    public static Course setCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Course ID: ");
        String id = sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Credit: ");
        int credit = sc.nextInt();
        return new Course(id, name, credit);
    }
    public void addStudent(Course course, Student Student) {
        course.StudentID.add(Student.id);
    }
    public void addFaculty(Course course, Faculty faculty) {
        course.FacultyID.add(faculty.id);
    }
}
class Name {
    String firstName;
    String midName;
    String lastName;
    Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }
    String getName() {
        return firstName + " " + midName + " " + lastName;
    }
}
class Address {
    String homeNumber;
    String street;
    String district;
    String city;
    Address(String homeNumber, String street, String district, String city) {
        this.homeNumber = homeNumber;
        this.street = street;
        this.district = district;
        this.city = city;
    }
    String getAdrress() {
        return homeNumber + " , " + street + " , " + district + " , " + city;
    }
}
public class ex4 {
    static String studentFile = "student.txt";
    static String facultyFile = "faculty.txt";
    static String courseFile = "course.txt";
    static List<Student> students = new ArrayList<>();
    static List<Faculty> faculties = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    public static void createFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeFile(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new
                FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    public static void showMenu () {
        System.out.println("------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. Add Course");
        System.out.println("3. Add Faculty");
        System.out.println("4. View list of students");
        System.out.println("5. View list of courses");
        System.out.println("6. View list of faculty");
        System.out.println("7. Add student to course");
        System.out.println("8. Add faculty to course");
        System.out.println("0. Exit");
        System.out.println("-----------------------");
    }
    public static void addStudent () {
        Student student = Student.setStudent();
        students.add(student);
        String data = "ID: " + student.id + ", Name: " +
                student.name.getName() +
                " ,Class:" + student.className
                + ", Phone: " + student.phone
                + ", Address: " + student.address.getAdrress() + "\n";
        writeFile(studentFile, data);
        System.out.println("Student's information entered: ");
        System.out.println(data);
    }
    public static void addCourse() {
        Course course = Course.setCourse();
        courses.add(course);
        String data = "ID: " + course.id + ", Name: " + course.name + ", " + course.credit + "" + "\n";
        System.out.println("Course's information entered: ");
        writeFile(courseFile, data);
        System.out.println(data);
    }
    public static void addFaculty() {
        Faculty faculty = Faculty.setFaculty();
        faculties.add(faculty);
        String data = "ID:" + faculty.id + ", Name: " +
                faculty.name.getName() +
                ", Job: " + faculty.job + ",Phone: "
                + faculty.phone + ",Address: " + faculty.address.getAdrress()
                +
                "\n";
        System.out.println("Faculty's infor entered:");
        writeFile(facultyFile, data);
        System.out.println(data);
    }
    public static void viewListOfStudents() {
        System.out.println(readFile(studentFile));
    }
    public static void viewListOfCourses() {
        System.out.println(readFile(courseFile));
    }
    public static void viewListOfFaculty() {
        System.out.println(readFile(facultyFile));
    }
    public static void addStudentToCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student and course ID: ");
        System.out.println("Student ID: ");
        String sID = sc.nextLine();
        System.out.println("Course ID: ");
        String cID = sc.nextLine();
        Student student = findStudent(sID);
        Course course = findCourse(cID);
        if (student != null && course != null) {
            student.addCourse(course);
            course.addStudent(course, student);
            System.out.println("Student " + student.name.getName() + " added to the course " + course.name);
        } else
            System.out.println("Not found!");
    }
    public static Student findStudent(String id) {
        for (Student student : students) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        return null;
    }
    public static Course findCourse(String id) {
        for (Course course : courses) {
            if (course.id.equals(id)) {
                return course;
            }
        }
        return null;
    }
    public static void addFacultyToCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faculty and course ID: ");
        System.out.println("faculty ID: ");
        String sID = sc.nextLine();
        System.out.println("Course ID: ");
        String cID = sc.nextLine();
        Faculty faculty = findFaculty(sID);
        Course course = findCourse(cID);
        if (faculty != null && course != null) {
            faculty.addCourse(course);
            course.addFaculty(course, faculty);
            System.out.println("Faculty " + faculty.name.getName() + " added to the course " + course.name);
        } else
            System.out.println("Not found!");
    }
    public static Faculty findFaculty(String id) {
        for (Faculty faculty : faculties) {
            if (faculty.id.equals(id)) {
                return faculty;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        createFile(studentFile);
        createFile(facultyFile);
        createFile(courseFile);
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Choose one option:");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    addFaculty();
                    break;
                case 4:
                    viewListOfStudents();
                    break;
                case 5:
                    viewListOfCourses();
                    break;
                case 6:
                    viewListOfFaculty();
                    break;
                case 7:
                    addStudentToCourse();
                    break;
                case 8:
                    addFacultyToCourse();
                    break;
                default:
                    System.out.println("Exit!");
                    break;
            }
        } while (choose != 0);
        scanner.close();
    }
}
