package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person PersonOne = new Person("�����", 175, 56);
		Person PersonTwo = new Person("������", 153, 33);
		
		PersonOne.showPersonInfo();
		PersonTwo.showPersonInfo();

	}

}
