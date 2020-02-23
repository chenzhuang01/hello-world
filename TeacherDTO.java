package Work06_DBUtil;

public class TeacherDTO {

	public String Teacher_ID;
	public String Teacher_NAME;
	public TeacherDTO(String teacher_ID, String teacher_NAME) {
		super();
		Teacher_ID = teacher_ID;
		Teacher_NAME = teacher_NAME;
	}
	
	public String getTeacher_ID() {
		return Teacher_ID;
	}
	public void setTeacher_ID(String teacher_ID) {
		Teacher_ID = teacher_ID;
	}
	public String getTeacher_NAME() {
		return Teacher_NAME;
	}
	public void setTeacher_NAME(String teacher_NAME) {
		Teacher_NAME = teacher_NAME;
	}
	
	
}
