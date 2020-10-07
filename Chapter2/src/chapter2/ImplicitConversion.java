package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum);
		
		// 작은 바이트에서 큰 바이트로의 전환은 자동으로 된다.
		// 정수에서 실수로서의 형변환 역시 자동으로 된다.
	}

}
