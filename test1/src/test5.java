import java.util.Scanner;

public class test5 {
	 public static void main(String[] args) {
		 int row;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("홀수를 입력하세요");
	        row = input.nextInt();
	            
	        for(int i=row/2, add=0; i>0; i--, add++) {
	            for(int j=0; j<=i-1; j++) {
	                System.out.print(" ");
	            }
	            for(int j=0; j<row/2 - (i-1)+add; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=0, add=row/2; i<row/2 + 1; i++, add--) {
	            for(int j=0; j<i; j++) {
	                System.out.print(" ");   
	            }
	            for(int j=0; j<(row/2 + 1)-i+add; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	 }
}

