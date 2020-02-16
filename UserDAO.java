package Work04_Login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UserDAO {
       //private DBUtil do = new DBUtil();
	   public  boolean flag = false;
	   public  String userPassWord = null;
	   public String fileName = "E:\\资料\\用户信息.txt";
	
       public boolean findName(String name) throws IOException{
   		String note;//用于接收readLine内容
   		FileReader fr = new FileReader(fileName);
   		BufferedReader bfr = new BufferedReader(fr);
   		while((note = bfr.readLine())!=null) {
   			//仅与名字对比
   			if(name.equals(note.split("\\,")[0])){
   				userPassWord = note.split("\\,")[1];
   				bfr.close();
   				return true;//一旦匹配成功，立马退出
   			}
   		}
   		bfr.close();
   		return false;
   	}
   	
   	public boolean findUser(String name, String password) throws IOException{
   		//名字不匹配直接错误
   		if(!findName(name)) {
   			flag = true;
   			return false;
   		}
   		if(password.equals(userPassWord))
   			//如果有匹配的，那么match里面一定修改了userPassWord
   			return true;
   		//不匹配则密码错误 ，返回false
   		return false;
   	}
}

