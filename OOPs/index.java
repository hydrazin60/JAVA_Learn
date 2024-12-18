package OOPs;

class Student {
    // Attributes (Instance Variables)
    String studentName;
    String level;
    int rollNumber;
    String subject;

    // Constructor to initialize the Student object
    public Student(String studentName, String level, int rollNumber, String subject) {
        this.studentName = studentName;
        this.level = level;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Level: " + level);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject: " + subject);
    }

    // Method to update the subject
    public void updateSubject(String newSubject) {
        this.subject = newSubject;
        System.out.println("Subject updated to: " + subject);
    }
}

public class index {
    public static void main(String args[]) {
        // Creating an object of the Student class
        Student student1 = new Student("Jiban Pandey", "Graduate", 101, "Bsc Csit");

        // Calling the method to display student details
        student1.displayDetails();

        // Updating the subject for the student
        student1.updateSubject("Computer Science");

        // Displaying the updated details
        student1.displayDetails();
    }
}
