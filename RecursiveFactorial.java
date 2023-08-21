public class RecursiveFactorial {
 int n;
 int factorial(int n) {
  if(n == 0)
    return (1);
  else
    return(n * factorial(n - 1));
  }

public static void main(String [] args) {
RecursiveFactorial x = new RecursiveFactorial();
x.n = Integer.parseInt(args[0]);
System.out.println("The factorial of " + x.n + "is" + x.factorial(x.n));
}
} 