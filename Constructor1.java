class Circle {
 double x , y;
 double r;
 Circle (double x, double y, double r) { 
  this.x = x; this.y = y; this.r = r; //Constructor 1
 }
 Circle (double r) {
  x = 3.0; y = 4.0 ; this.r = r; //constructor 2 with one value initialization and other are constant
 }
 Circle (Circle c) {
  x = c.x; y = c.y; r = c.r; //constructor 3 with passing an object
 }
 Circle() {
  x= 3.0; y = 4.0; r = 5.0; // constructor 4 with no value passing
 }
 double circumference() {
  return  2 * 3.14159 * r;
 }
 double area() {
  return  2 * (22/7) * r * r;
 }
}
class Constructor1 {
 public static void main (String[]args) {
  Circle c1 = new Circle(3.0, 4.0, 5.0);
  Circle c2 = new Circle(5.0);
  Circle c3 = new Circle(c1);
  Circle c4 = new Circle();
  System.out.println("Circumference of circle 1" + c1.circumference());
  System.out.println("Circumference of circle 2" + c2. circumference());
  System.out.println("Area of circle 3" + c3.area());
  System.out.println("Area of circle 4" + c4.area());
 }
}
 