package Work06_DBUtil;

import java.util.List;

public class StudentDAO {

	private static DBUtil dBOperator = new DBUtil();
	private List<StudentDTO> Student = dBOperator.StudentData();
	
	public void setDBOperator(DBUtil dBOperator) {
		this.dBOperator = dBOperator;
	}
	
	public StudentDTO findStudentByld(String id) {
		boolean flag = false;
		int i = 0;
		for(StudentDTO s: Student) { 
		    if(id.equals(s.getStudent_ID())) {
		    	System.out.println("��ѧ����ϢΪ: " + s.getStudent_ID() + "---" + s.getStudent_NAME());
                flag = true;
                break;
            }
		    i++;
		}
		if(!flag)
			System.out.println("���޴���");
		return flag ? Student.get(i):null;	
		
		
	}
	
	public List findAllStudents() {
		System.out.println("����ѧ����Ϣ����: ");
		for(StudentDTO s : Student)
			System.out.println(s.getStudent_ID() +"---"+ s.getStudent_NAME());
		return Student;
		
	}
	
	public int save(StudentDTO student) {
		Student.add(student);
		return Student.size()-1;
		
	}
	
	
}
