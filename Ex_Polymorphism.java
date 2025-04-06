// Parent class
class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

// Subclass representing a student
class Student extends Person {

    void displayInfo() {
        System.out.println("Student Info: Name: Alex, Grade: A, Major: Computer Science");
    }
}

// Subclass representing a teacher
class Teacher extends Person {

    void displayInfo() {
        System.out.println("Teacher Info: Name: Mrs. Smith, Subject: Mathematics");
    }
}

public class Ex_Polymorphism {
    public static void main(String[] args) {
        Person person;

        person = new Student();
        person.displayInfo();

        person = new Teacher();
        person.displayInfo();  
    }
}
