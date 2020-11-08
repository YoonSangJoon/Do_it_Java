package schedular;

import java.io.IOException;
import java.sql.Connection;

public class SchedularTest {

	public static void main(String[] args) throws IOException {
				
		// R = round, L = least, P = priority
		System.out.print("��ȭ ��� ��й���� �����ϼ���. R, L, P : ");
		
		int ch = System.in.read();
		Schedular schedular = null;
		
		if (ch == 'R' || ch == 'r') {
			schedular = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			schedular = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			schedular = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
