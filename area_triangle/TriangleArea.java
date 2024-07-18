//scanner helps us to take data from user
import java.util.Scanner;
public class TriangleArea {
  public void getInput(String[] args) {
    
    //below we have put methods to ask user to enter the base and height of a triangle
   try (Scanner input = new Scanner(System.in)){
    System.out.println("Enter the base of the triangle");
base = input.nextInt();
System.out.println("Enter the height of the triangle");
height = input.nextInt();}

  }  
  public double computeArea (String[] args) {
    // method to compute area of a triangle
    return 0.5 * base * height;
  }
  public void displayArea (String[] args) {
    // below is method to output area of the triangle
    double area = computeArea(args);
System.out.println("The area of the triangle is" + area);
  }
  private int base, height;
  // Main method to run the program
  public static void main(String[] args) {
    TriangleArea triangle = new TriangleArea();
    triangle.getInput(args);
    triangle.displayArea(args);
  }
}
