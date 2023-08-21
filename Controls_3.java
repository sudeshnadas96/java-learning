class Controls_3 {
 public static void main(String[]args) {
  for(int i = 0; i < 12; i++) {
   System.out.print(i + " ");
   if(i % 2 == 0) continue;
   System.out.println(" ");
  }
 }
}