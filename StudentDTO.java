package Work06_DBUtil;

public class StudentDTO {

	public String Student_ID;
	public String Student_NAME;
	
	public StudentDTO(String Student_ID, String Student_NAME) {
		super();
		this.Student_ID = Student_ID;
		this.Student_NAME = Student_NAME;
	}
	
	public String getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(String student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_NAME() {
		return Student_NAME;
	}
	public void setStudent_NAME(String student_NAME) {
		Student_NAME = student_NAME;
	}
	
	
}
