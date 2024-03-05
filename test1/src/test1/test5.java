package test1;

import java.util.Scanner;

public class test5 {
   
   public static void main(String []args) {
      
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      String op = sc.next();
      int num2 = sc.nextInt();
      
      if (op.equals("+")) {
    	  System.out.println(num1+""+op+""+num2+"="+(num1+num2));
      } else if (op.equals("-")) {
    	  System.out.println(num1+""+op+""+num2+"="+(num1-num2));
      } else if (op.equals("*")) {
    	  System.out.println(num1+""+op+""+num2+"="+(num1*num2));
      } else if (op.equals("/")) {
    	  System.out.println(num1+""+op+""+num2+"="+(double)num2/num2);
      } else {
    	  System.out.println("잘못된 입력입니다");
      }
   }
}
