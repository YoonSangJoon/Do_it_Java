package loopexample;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan = 2;
		int times = 1;
		
		while (dan <= 9) {
			times = 1;
			
			while (times <= 9) {
				System.out.println(dan + "X" + times + "=" + (dan*times));
				times++;
			}
			dan++;
		}
	}

}
