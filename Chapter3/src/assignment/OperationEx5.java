package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 11;
		
		int result = num1 & num2;
		System.out.println(result);
		
		// ��Ʈ ������
		// 5 : 00000101 , 10 : 00001010
		// & ������ : �� ��Ʈ �� �ڸ����� 0,1 �� ���� ���Ͽ� �� ��Ʈ�� ��� 1�� ��츸 1. �ƴϸ� 0.
		// | ������ : �� ��Ʈ�� ��� 0�� ��츸 0. �ƴϸ� 1.
		
		int num3 = 5;
		int num4 = 10;
		
		int result2 = num3 | num4;
		System.out.println(result2);
		
		int num5 = 5; // 00000101;
		
		System.out.println(num5 << 1);
		// ���ϱ� 2�� �Ȱ���. ���� <<= �� �´ٸ� num5 �� ��ü�� �ٲ�� �ȴ�.
		System.out.println(num5);
		System.out.println(num5 << 2);
		System.out.println(num5 << 3);
		
		System.out.println(num5 >> 1); // 00000010;
	}

}
