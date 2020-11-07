package gamelevel;

public abstract class PlayerLevel {
	
	int level;
	public void run() {
		if (level == 1) {
			System.out.println("õõ�� �޸��ϴ�.");
		} else if (level == 2) {
			System.out.println("���� �޸��ϴ�.");
		} else if (level == 3) {
			System.out.println("��û ���� �޸��ϴ�.");
		}
	}
	
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go (int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
