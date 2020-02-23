package Work06_DBUtil;

import java.util.List;

public class TeacherDAO {

	private DBUtil dBOperator = new DBUtil();
	private List<TeacherDTO> Teacher = dBOperator.TeacherData();
	
	public void setDBOperator(DBUtil dBOperator) {
		this.dBOperator = dBOperator;
	}
	
	public TeacherDTO findStudentByld(String id) {
		boolean flag = false;
		int i = 0;
		for(TeacherDTO t: Teacher) { 
		    if(id.equals(t.getTeacher_ID())) {
		    	System.out.print("����ʦѧ����ϢΪ: " + t.getTeacher_ID() + "---" + t.getTeacher_NAME());
                flag = true;
                break;
            }
		    i++;
		}
		if(!flag)
			System.out.println("���޴���");
		return flag ? Teacher.get(i):null;	
		
		
	}
	
	public List findAllStudents() {
		System.out.println("������ʦ��Ϣ����: ");
		for(TeacherDTO s : Teacher)
			System.out.println(s.getTeacher_ID() +"---"+ s.getTeacher_NAME());
		return Teacher;
		
	}
	
	public int save(TeacherDTO teacher) {
		Teacher.add(teacher);
		return Teacher.size()-1;
		
	}
}
