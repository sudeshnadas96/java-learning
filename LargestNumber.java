import java.util.Scanner;

public class LargestNumber {
 public static void main(String[]args) {
  Scanner s = new Scanner(System.in);
  int x , y, z;
  int result = 0;
  System.out.print("Enter the value of x: ");
  x = s.nextInt();
  System.out.println("Enter the value of y: ");
  y = s.nextInt();
  System.out.print("Enter the value of Z: ");
  z = s.nextInt();
  if(x >= y && x >= z) {
     result = x;
  } else if(y >=x && y>=z) {
     result = y;
  } else {
     result = z;
  }
  System.out.println("The larest number among x , y and z is: " + result);
  s.close();
 }
}
  