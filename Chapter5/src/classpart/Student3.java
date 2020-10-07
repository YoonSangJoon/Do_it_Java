package classpart;

public class Student3 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		
		Student studentLee = new Student();
		studentLee.studentName = "ÀÌ¼ø½Å";
		studentLee.studentID = 100;
		studentLee.address = "Ã»ÁÖ";
		
		Student studentKim= new Student();
		studentKim.studentName = "±èÁÂÁø";
		studentKim.studentID = 101;
		studentKim.address = "´ëÀü";
	
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}
	
	
}