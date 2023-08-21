class Circle {
 double x , y;
 double r;
 double Circumference() {
   return 2*3.14159*r;
 }
 double Area() {
   return 2 * 22/7 * r;
 }
}
class Demo1 {
 public static void main(String[]args) {
 Circle c1 = new Circle();
 Circle c2 = new Circle();
 c1.x = 3.0;
 c1.y = 4.0;
 c1.r = 5.0;
 c2.x = 4.0;
 c2.y = 8.0;
 c2.r = 10.0;
 System.out.println("Circumference of circle1" + c1.Circumference());
 System.out.println("Circumference of circle2" + c2.Circumference());
 System.out.println("Area of circle1" + c1.Area());
 System.out.println("Area of circle2" +c2.Area());
 }
}