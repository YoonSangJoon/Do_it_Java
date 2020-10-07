package chapter2;

public class DoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum = 3.14;
		
		// double : 실수 only (8byte)
		
		float fNum = 3.14F;
		
		// 실수는 기본적으로 double로 저장되기 때문에 float에 저장하려면 뒤에 F 붙여야함.
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		var num = 10;
		System.out.println(num);
		
		// num = 3.14; 안됨.
		
		// var 로 자료형이 한번 정해지면 이후에 다른 자료형의 데이터 입력 불가능.
		
	}	

}
