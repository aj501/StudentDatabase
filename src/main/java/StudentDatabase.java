/**
 * StudentDatabase classs
 */
public class StudentDatabase {

  /**
   * main method.
   * @param args argument
   */
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.enroll();
    s1.payTuition();
    System.out.println(s1.toString());
  }
}
