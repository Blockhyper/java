package SHIVAM;

import java.util.Scanner;


public class SHIVAM {

  public static void main(String[] args) {
   float x, y, sum, min, mul, div; 
  
   Scanner a = new Scanner(System.in);
   System.out.println("Enter First no");
   x = a.nextInt();
   
   Scanner d = new Scanner(System.in);
   System.out.println("S for square root, A for changing the no positive to negative");
   System.out.println("B for negative to positive");
   System.out.println("If you want to input second no for other operation then press H");
   char p = d.next().charAt(0);
   
   
   if(p == 'S'){
     System.out.println(Math.sqrt(x));
   }else if(p == 'A'){
   System.out.println(x - x * 2);
   }
  else if(p == 'B'){
   System.out.println(Math.abs(x));
   }else{
   
   Scanner b = new Scanner(System.in);
   System.out.println("Enter Second no");
   y = b.nextInt();
   
   Scanner c = new Scanner(System.in);
   System.out.println("A,B,C,D");
   char s = c.next().charAt(0);
   
       sum = x + y;
       min = x - y;
       mul = x * y;
       div = x / y;
     
   
   if(s == 'A'){
     System.out.println("Sum is " + sum);
   }
   if(s == 'B'){
     System.out.println("Subtraction is " + min);
   }
   if(s == 'C'){
     System.out.println("Product is " + mul);
   }
   if(s == 'D'){
     System.out.println("Answer is " + div);
   }
   }
  }
}
