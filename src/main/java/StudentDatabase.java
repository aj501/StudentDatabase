import java.util.Scanner;

/**
 * StudentDatabase classs
 */
public class StudentDatabase {

  /**
   * main method.
   * @param args argument
   */
  public static void main(String[] args) {

    System.out.println("Enter number of new students to enroll: ");
    int numberOfStudent;
    Scanner in = new Scanner(System.in);
    numberOfStudent = in.nextInt();
    Student[] students = new Student[numberOfStudent];
    for (int i = 0; i < students.length; i++){
      students[i] = new Student();
      students[i].enroll();
      students[i].payTuition();
      System.out.println(students[i].toString());
    }
  }
}
