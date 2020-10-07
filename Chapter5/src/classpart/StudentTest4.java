package classpart;

public class StudentTest4 {

	public static void main(String[] args) {

		int i = 10;

		Student4 studentLee = new Student4(100, "ÀÌ¼ø½Å");
		studentLee.address = "Ã»ÁÖ";

		Student4 studentKim = new Student4(101, "±èÁÂÁø");
		studentKim.address = "´ëÀü";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
