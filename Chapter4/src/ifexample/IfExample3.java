package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 5;
		int charge = 0;

		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}

		if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}

		if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}

		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}

		System.out.println("입장료는 " + charge + "원 입니다.");

		// 이 경우 모든 if문을 다 계산하기때문에 리소스가 낭비됨. 원래같으면 첫번째 if문에서 바로 빠져나와야되는데, 이 로직의 경우 else
		// if가 아니기 때문에.
	}

}
