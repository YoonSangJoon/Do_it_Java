package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int [] numbers = new int[] {0, 1, 2};
		
		// 배열의 초기화.
		
		int [] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(numbers.length);
		
		
		int [] studentsIDs = new int [5];
		
		for (int i = 0; i < studentsIDs.length; i++) {
			System.out.println(studentsIDs[i]);
		}
	}

}
