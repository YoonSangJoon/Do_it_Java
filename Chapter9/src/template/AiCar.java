package template;

public class AiCar extends Car{

		@Override
		public void drive() {
			System.out.println("���� �����մϴ�.");
			System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�..");
		}

		@Override
		public void stop() {
			System.out.println("�ڵ����� ������ �����մϴ�.");
		}

		@Override
		public void wiper() {
			System.out.println("�� ���� �翡 ���� �ڵ����� �����˴ϴ�.");
			
		}
		
		@Override
		public void washCar() {
			System.out.println("�ڵ����� ������ ����˴ϴ�.");
		}

	}