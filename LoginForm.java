package Work04_Login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginForm {
     private UserDAO dao = new UserDAO();
     
     public void init() {
    	 System.out.println("-------------欢迎光临-------------");
	     System.out.println("1. 注册");
		 System.out.println("2. 登录");
		 System.out.println("3. 退出");
		 System.out.println("请输入你的选择； ");
     }
     
    // 用户信息格式为name,password(一人一行)
 	/*
 	 * 登录
 	 * 
 	 */
 	public  boolean login(String name, String password) throws IOException{
 		if(dao.findUser(name, password)) {
 			System.out.println("欢迎"+name+"登录成功");
 			return true;
 		}
 		if(dao.flag == true) {
 			System.out.println("用户不存在");
 			return false;
 		}else {
 			System.out.println("密码不正确");
 			return false;
 		}
 	}
 	
 	/*
 	 * 注册
 	 * 
 	 */
 	public void register(String name, String password) throws IOException{
 		//比对姓名
 		if(dao.findName(name)) {
 			System.out.println("用户名已经存在，换个名字试试");
 			return;
 		}
 		
 		//没有这个人可以继续注册
 		//将用户信息写入到文件中，用带有append的构造方法
 		//拼接用户信息
 		String userInfo = name + "," + password;
 		FileWriter fw = new FileWriter(dao.fileName, true);
 		BufferedWriter bw = new BufferedWriter(fw);
 		
 		//先换行，再写入
 		//若是第一次写入，就不用换行
 		if(new File(dao.fileName).length()==0) {
 			bw.write(userInfo);
 			bw.flush();
 			bw.close();
 			System.out.println("注册成功！");
 			return;
 		}
 		bw.newLine();
 		bw.write(userInfo);
 		bw.flush();
 		bw.close();
 		System.out.println("注册成功！");
 	}
}
