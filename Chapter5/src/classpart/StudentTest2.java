package classpart;

public class StudentTest2 {

	public static void main(String[] args) {

		int i = 10;

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "û��";

		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "����";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}
}
