package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 + 10) > 10) && ((i = i+2) > 10));
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 4
		
		boolean value2 = ( ((num1 = num1 + 10) > 10) || ((i = i+2) > 2));
		System.out.println(value2); // true
		System.out.println(num1); // 30
		System.out.println(i); // 4
	}

}
