
public class test1 {
	public static void main(String []args) {
		for(int i=1; i<6; i+=2) {
			for(int j=5; j>i; j-=2) {
				System.out.print(" ");
				}
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}
