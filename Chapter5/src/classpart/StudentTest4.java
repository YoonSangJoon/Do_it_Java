package classpart;

public class StudentTest4 {

	public static void main(String[] args) {

		int i = 10;

		Student4 studentLee = new Student4(100, "�̼���");
		studentLee.address = "û��";

		Student4 studentKim = new Student4(101, "������");
		studentKim.address = "����";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
