package ch03;

public class C04TypeChange {

	public static void main(String[] args) {
//		//정수 연산식(int 보다 작은 변수자료형(short,char,byte))
//		//int로 자동 형변환
//		byte x = 10;
//		byte y = 20;
//		byte result1 = (byte)(x+y);	// 연산시 자동으로 int형
//		// 컴파일 에러x,y는 각각 int형 자료료 담아서 처리가 되고		
//		// 왼쪽 byte형으로 저장시 작은공간에 큰자료형 타입 넣으려
//		
//		//int result1 = x + y;
//		System.out.println(result1);
		
		// 정수 연산식(int보다 큰 변수자료형(long))
		// 큰 타입으로 자동 형 변환
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		//int result = (int)var1 + (int)var2 + (int)var3; 
		// 오른쪽 변수들은 long 으로 자동 형변환
		// but 왼쪽 공간이 작은 공간이기 때문
		
		long result2 = var1 + var2 + var3;
		System.out.println(result2);
		
		//실수연산식
		//큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.5F;
		double dbvar = 5.5;
		double result3 = intvar + flvar + dbvar;
		// intvar, flvar가 각각 double형으로 형변환
		
		System.out.println(result3);
		

	}

}
