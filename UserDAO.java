package Work04_Login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UserDAO {
       //private DBUtil do = new DBUtil();
	   public  boolean flag = false;
	   public  String userPassWord = null;
	   public String fileName = "E:\\����\\�û���Ϣ.txt";
	
       public boolean findName(String name) throws IOException{
   		String note;//���ڽ���readLine����
   		FileReader fr = new FileReader(fileName);
   		BufferedReader bfr = new BufferedReader(fr);
   		while((note = bfr.readLine())!=null) {
   			//�������ֶԱ�
   			if(name.equals(note.split("\\,")[0])){
   				userPassWord = note.split("\\,")[1];
   				bfr.close();
   				return true;//һ��ƥ��ɹ��������˳�
   			}
   		}
   		bfr.close();
   		return false;
   	}
   	
   	public boolean findUser(String name, String password) throws IOException{
   		//���ֲ�ƥ��ֱ�Ӵ���
   		if(!findName(name)) {
   			flag = true;
   			return false;
   		}
   		if(password.equals(userPassWord))
   			//�����ƥ��ģ���ômatch����һ���޸���userPassWord
   			return true;
   		//��ƥ����������� ������false
   		return false;
   	}
}

