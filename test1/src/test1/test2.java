package test1;
//import java.util.*; 
//public class test2 {
//	public static void main(String []args) {
//			   
//			   Scanner scanner = new Scanner(System.in);
//			   System.out.println("숫자를 입력해주세요");
//			   int a = scanner.nextInt();
//			   System.out.println("숫자를 입력해주세요");
//			   int b = scanner.nextInt();
//			   
//			   if(a>b) {
//				   System.out.println("a가 큽니다");
//			   }
//			   else if(a==b) {
//					   System.out.println("a와 b가 같습니다");
//				   }
//			   else {					   
//				   System.out.println("b가 큽니다");
//			   }
//				   
//		   }
//			   
//}
//

		
		import java.util.Scanner;

		public class test2 {
		   
		   public static void main(String []args) {
		      
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.println("숫자를 입력해주세요.");
		      int num1 = sc.nextInt();
		      
		      System.out.println("연산자를 입력해주세요.");
		      String str  = sc.next();
		      
		      System.out.println("숫자를 입력해주세요.");
		      int num2 = sc.nextInt();

		
		switch(str) {
        case "+" :
           System.out.println(num1+str+num2+"="+(num1+num2));
           break;
        case "-" :
           System.out.println(num1+str+num2+"="+(num1-num2));
           break;
        case "*" :
           System.out.println(num1+str+num2+"="+(num1*num2));
           break;            
        case "/" :
           System.out.println(num1+str+num2+"="+((double)num1/(double)num2));
           break;            
        default:     
           System.out.println("올바른 입력이 아닙니다.");
     }
  }
}