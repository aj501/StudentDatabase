import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Student class.
 */
public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int defaultCost = 600;
  private static int id = 1000;
  //static: the value is not specific to an object but something is true for all objects. It belong to the class,
  //not an instance of object.

  //Need a constructor prompt user to enter student's name and year

  /**
   * Student constructor
   */
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter student first name: ");
    this.firstName = in.nextLine();
    System.out.println("Enter student last name: ");
    this.lastName = in.nextLine();
    System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior. Enter student seniority level: ");
    this.gradeYear = in.nextInt();
    setStudentID();
   // System.out.println(firstName + " " + lastName + "\n" + "Grade year: " + gradeYear + "\nStudent ID: " + studentID);
  }


  /**
   * generate student Id with their grade year at the front of their student ID.
   */
  private void setStudentID() {
    id++;
    this.studentID = gradeYear + "" + id;
  }

  /**
   * enroll method to enroll course in student's schedule.
   */

  public void enroll() {
    String courseNumber;
    do {
      System.out.println("Enter your course number to enroll, enter Q to quit: ");
      Scanner in = new Scanner(System.in);
      courseNumber = in.nextLine();
      if (!courseNumber.equals("Q")) {
        courses = courses + "\n" + courseNumber;
        tuitionBalance = tuitionBalance + defaultCost;
      } else {
        break;
      }
    } while (true);
  }

  /**
   * viewBalance shows student current tuition balance.
   */
  public void viewBalance() {
    System.out.println("TUITION BALANCE: $" + tuitionBalance);
  }

  /**
   * payTuition allows student to pay part or all of their tuition balance.
   */

  public void payTuition(){
    viewBalance();
    System.out.println("Please enter amount you would like to pay: ");
    int paymentAmount;
    Scanner in  = new Scanner(System.in);
    paymentAmount = in.nextInt();
    tuitionBalance  = tuitionBalance - paymentAmount;
    System.out.println("Thank you for your payment of: $" + paymentAmount);
    viewBalance();
  }

  /**
   * toString method shows student's info.
   * @return student's info.
   */

  public String toString(){
    return "Student's Name: " + firstName + " " +lastName +
        "\nSID: " + studentID + "\nGrade level: " + gradeYear +
        "\nCourses enrolled: " + courses + "\nBalance: $" + tuitionBalance;
  }
}




