import java.util.Scanner;
public class Exercise1_1 {
  public static void main(String[]args) {
    Scanner s = new Scanner(System.in);
    double perimeter;
    double area;
    System.out.print("Enter the radius of the circle: ");
    double radius = s.nextDouble();
    if(radius<=0) {
       System.out.println("please enter non zero positive number");
    } else {
     perimeter = 2 * Math.PI * radius;
     area = Math.PI * radius * radius;
     System.out.println("Perimeter of the circle: " + perimeter);
     System.out.println("Area of the circle: " + area);
    }
     s.close();
  }
}