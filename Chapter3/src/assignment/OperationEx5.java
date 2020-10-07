package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 11;
		
		int result = num1 & num2;
		System.out.println(result);
		
		// 비트 연산자
		// 5 : 00000101 , 10 : 00001010
		// & 연산자 : 두 비트 각 자릿수의 0,1 을 서로 비교하여 두 비트가 모두 1인 경우만 1. 아니면 0.
		// | 연산자 : 두 비트가 모두 0인 경우만 0. 아니면 1.
		
		int num3 = 5;
		int num4 = 10;
		
		int result2 = num3 | num4;
		System.out.println(result2);
		
		int num5 = 5; // 00000101;
		
		System.out.println(num5 << 1);
		// 곱하기 2와 똑같다. 만일 <<= 가 온다면 num5 값 자체가 바뀌게 된다.
		System.out.println(num5);
		System.out.println(num5 << 2);
		System.out.println(num5 << 3);
		
		System.out.println(num5 >> 1); // 00000010;
	}

}
