public class Question_03 {
 public static void main(String[]args) {
  int[] A = {1,0,1};
  for(int i = 0; i < A.length; i++) {
   A[i] = A[(A[i] + 3) % A.length];
  }
  for(int i = 0; i < A.length; i++) {
   System.out.print(A[i]);
  }
}
}