package loopexample;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 10);

		// 수행문을 먼저 한번 수행한 후 while 조건 따지게 되는 논리.
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
