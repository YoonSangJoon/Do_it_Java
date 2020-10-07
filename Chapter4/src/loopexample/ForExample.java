package loopexample;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int sum; // = 0;
		
		for ( num = 1, sum = 0; num <= 10; num++ ) {
			
			sum += num;
			
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
