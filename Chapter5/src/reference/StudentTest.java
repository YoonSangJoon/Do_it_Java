package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(100);
		
		Student studentThomas = new Student(101, "Thomas");
		studentThomas.setKorea(90);
		studentThomas.setMath(91);
		
		studentJames.showStudentInfo();
		studentThomas.showStudentInfo();
	}

}
