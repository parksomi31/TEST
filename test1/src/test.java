
public class test{
	public static void main(String []args) {
		for(int i=0;i<3;i++ ) {
			for (int j=2; j>i; j--) {
			System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
