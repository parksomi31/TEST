
///* 반복문 : 조건
// * for문
// * while문  --> for나 while은 처음부터 체크
// * 
// * do~while문 --> 한번 확인하고 체크
// * 
// * foreach문: 배열을 사용할 때 사용.
// * 
// * for(초기문; 조건문; 증감문) {
//...........
//}

package test1;

public class test6 {
	
	public static void main(String []args) {
	
	int rect = 1;
	int count = 0;
		
		for(count=0;rect<500;count++) {
			rect *= 2;
		}
			System.out.println(count);
			System.out.println(rect);
	}
}

//		
//		for(int i = 0;i<10;i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0;i<2;i++) {
//			for(int j = 0;j<3;j++);
//		}
//		System.out.println();
//	}
//
//}