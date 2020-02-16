package Work04_Login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginForm {
     private UserDAO dao = new UserDAO();
     
     public void init() {
    	 System.out.println("-------------��ӭ����-------------");
	     System.out.println("1. ע��");
		 System.out.println("2. ��¼");
		 System.out.println("3. �˳�");
		 System.out.println("���������ѡ�� ");
     }
     
    // �û���Ϣ��ʽΪname,password(һ��һ��)
 	/*
 	 * ��¼
 	 * 
 	 */
 	public  boolean login(String name, String password) throws IOException{
 		if(dao.findUser(name, password)) {
 			System.out.println("��ӭ"+name+"��¼�ɹ�");
 			return true;
 		}
 		if(dao.flag == true) {
 			System.out.println("�û�������");
 			return false;
 		}else {
 			System.out.println("���벻��ȷ");
 			return false;
 		}
 	}
 	
 	/*
 	 * ע��
 	 * 
 	 */
 	public void register(String name, String password) throws IOException{
 		//�ȶ�����
 		if(dao.findName(name)) {
 			System.out.println("�û����Ѿ����ڣ�������������");
 			return;
 		}
 		
 		//û������˿��Լ���ע��
 		//���û���Ϣд�뵽�ļ��У��ô���append�Ĺ��췽��
 		//ƴ���û���Ϣ
 		String userInfo = name + "," + password;
 		FileWriter fw = new FileWriter(dao.fileName, true);
 		BufferedWriter bw = new BufferedWriter(fw);
 		
 		//�Ȼ��У���д��
 		//���ǵ�һ��д�룬�Ͳ��û���
 		if(new File(dao.fileName).length()==0) {
 			bw.write(userInfo);
 			bw.flush();
 			bw.close();
 			System.out.println("ע��ɹ���");
 			return;
 		}
 		bw.newLine();
 		bw.write(userInfo);
 		bw.flush();
 		bw.close();
 		System.out.println("ע��ɹ���");
 	}
}
