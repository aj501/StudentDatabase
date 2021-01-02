import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses = null;
  private int tuitionBalance = 0;
  private static int defaultCost = 600;
  private static int id = 1000;
  private int numbOfStudent = 5;
  //static: the value is not specific to an object but something is true for all objects. It belong to the class,
  //not an instance of object.

  //Need a constructor prompt user to enter student's name and year
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();
    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();
    System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior. Enter student seniority level: ");
    this.gradeYear = in.nextInt();
    setStudentID();
    System.out.println(firstName + " " + lastName + "\n" + "Grade year: " + gradeYear + "\nStudent ID: " + studentID);
  }


  //Generate ID
  private void setStudentID() {
    id++;
    this.studentID = gradeYear + "" + id;
  }

  private String getStudentID() {
    return studentID;
  }

  //Enroll in courses
  public void enroll() {
    String courseNumber;
    do { System.out.println("Enter your course number to enroll, enter Q to quit: ");
      Scanner in = new Scanner(System.in);
      courseNumber = in.nextLine();
      courses = courses + "\n" + courses;
      tuitionBalance = tuitionBalance + defaultCost;
    }while(!courseNumber.equals("Q"));
    System.out.println("Enrolled in: " + courses);
    System.out.println("Tuition balance: " + tuitionBalance);
  }
}
//View balance and pay tuition

//Show status of student

