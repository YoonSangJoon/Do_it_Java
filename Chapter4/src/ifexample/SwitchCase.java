package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rank = 2;
		char medalColor;

		switch (rank) {
		case 1:
			medalColor = 'G';
			break;

		case 2:
			medalColor = 'S';
			break;

		case 3:
			medalColor = 'B';
			break;

		default:
			medalColor = 'A';
		}

		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}

}