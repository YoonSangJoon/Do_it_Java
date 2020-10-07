package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		// iNum의 바이트 값이 bNum에 들어가면서 일부가 잘려나갔기 때문에 값이 다르게 나옴.
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
