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

		// ���๮�� ���� �ѹ� ������ �� while ���� ������ �Ǵ� ��.
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}
