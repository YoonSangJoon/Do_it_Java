package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
//		10001
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
//		10002
		
//		두 serialNum 인스턴스가 공유되고 있음!
//		static 변수는 보통 클래스 이름으로 선언.

	}

}
