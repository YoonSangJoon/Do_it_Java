package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		num1 -= 1;	// num1 = num1 - 1
		System.out.println(num1);
		
		
		int num = (5 > 3) ? 10: 20; // if문과 같은 역할. 조건이 참이면 : 앞의 기능 수행. 거짓이면 뒤의 기능 수행.
		System.out.println(num);
		
		int num2 = (1>3)? 10:20;
		System.out.println(num2);
		
	}

}
