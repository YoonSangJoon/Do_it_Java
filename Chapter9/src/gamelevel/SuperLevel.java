package gamelevel;

public class SuperLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높은 Jump 가능합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("넓은 turn 가능합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== 상급자 레벨입니다. ===");
	}

}
