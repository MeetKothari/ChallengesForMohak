// This is your first challenge:
// The goal of this program is to retrieve data from a custom class and display it to the screen.
// The data should include an ID, first name, and last name...
// Find what's wrong with this program and get it to display

// Sample Output:
// Student data in student arr 0:
// Student id is: 1701289270 and Student name is: Meet Kothari
//
// Student data in student arr 1:
// Student id is: 1701289219 and Student name is: Mohak Kothari
//

class GFG {

    public static void main(String args[])
    {

        // Declaring an array of student
        Student[] arr;

        // Allocating memory for 2 objects of type student
        arr = new Student[3];

        // initializing arrays
        arr[0] = new Student(1701289270, "Meet");
        arr[1] = new Student(1701289219, "Mohak");
        arr[2] = new Student( 1701289218, "Nirav");

        // Displaying the student data
        System.out.println("Student data in student arr 0: ");
        arr[0].display();

        System.out.println("Student data in student arr 1: ");
        arr[1].display();

        System.out.println("Student data in student arr 2: ");
        arr[2].display();
    }
}

// Creating a student class with id and name as a attributes
class Student {

    public int id;
    public String firstName;
    public String lastName;

    // Student class constructor
    Student(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
    }

    // display() method to display the student data
    public void display() {
        System.out.println("Student id is: " + id + " " + "and Student name is: " + firstName);
        System.out.println();
    }
}