package test1;

public class test7 {

	public static void main(String []args) {
		
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}

//print를 하면 줄바꿈이 안됨
//pirntln으로 하면 줄바꿈이 됨
//\t는 tab기능