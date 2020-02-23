package Work06_DBUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DBUtil {


	public List<StudentDTO> StudentData() {
		List<StudentDTO> student = new ArrayList<>();
		StudentDTO s1 = new StudentDTO("201803111", "张三");
		StudentDTO s2 = new StudentDTO("201803222", "李四");
		StudentDTO s3 = new StudentDTO("201803333", "王五");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		return student;
	}
	
	public List<TeacherDTO> TeacherData() {
		List<TeacherDTO> teacher = new ArrayList<>();
		TeacherDTO t1 = new TeacherDTO("1010111", "张老师");
		TeacherDTO t2 = new TeacherDTO("1010222", "李老师");
		TeacherDTO t3 = new TeacherDTO("1010333", "王老师");
		teacher.add(t1);
		teacher.add(t2);
		teacher.add(t3);
		return teacher;
	}
	
	public static void main(String[] args) {
		
		StudentDAO studentdao= new StudentDAO();
		List l = studentdao.findAllStudents();
		StudentDTO student = new StudentDTO("201803444","陈六");
		studentdao.save(student);
		List ll = studentdao.findAllStudents();
		studentdao.findStudentByld("201803111");
		TeacherDAO td = new TeacherDAO();
		List t = td.findAllStudents();
		
	}
}
