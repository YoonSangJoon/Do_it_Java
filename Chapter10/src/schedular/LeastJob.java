package schedular;

public class LeastJob implements Schedular{

	@Override
	public void getNextCall() {
		System.out.println("����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� ���� ������ ���� �տ� �켱 ����մϴ�.");
	}
	
	
}
