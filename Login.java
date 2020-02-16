package Work04_Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {

	//  保存用户信息的路径
	public static String fileName= "E:\\资料\\用户信息.txt";
	
	//matchName向matchPassWord传递的信息 : (登录比对已经整合到match里了)
	//保存已存在用户的密码
	public static String userPassWord = null;
	
	//match 向 login 传递的信息
	//用户名错误还是密码错误
	//用户名错误不会修改flag
	public static boolean flag = false;
	
	// 用户信息格式为name,password(一人一行)
	/*
	 * 登录
	 * 
	 */
	public static boolean login(String name, String password) throws IOException{
		if(findUser(name, password)) {
			System.out.println("欢迎"+name+", 登录成功");
			return true;
		}
		if(flag == true) {
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
	public static void register(String name, String password) throws IOException{
		//比对姓名
		if(findName(name)) {
			System.out.println("用户名已经存在，换个名字试试");
			return;
		}
		
		//没有这个人可以继续注册
		//将用户信息写入到文件中，用带有append的构造方法
		//拼接用户信息
		String userInfo = name + "," + password;
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//先换行，再写入
		//若是第一次写入，就不用换行
		if(new File(fileName).length()==0) {
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
	
	/*
	 * 在文件中找是否存在此人
	 * @return 匹配成功与否
	 * 
	 */
	public static boolean findName(String name) throws IOException{
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
	
	public static boolean findUser(String name, String password) throws IOException{
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
	
	public static void main(String[] args) throws IOException{
			String name;
			String password;
			while(true) {
				System.out.println("-------------欢迎光临-------------");
				System.out.println("1. 注册");
				System.out.println("2. 登录");
				System.out.println("3. 退出");
				System.out.println("请输入你的选择； ");
				Scanner sc = new Scanner(System.in);
				String choiceString = sc.next();
				switch(choiceString) {
				case "1":
					System.out.println("请输入用户名： ");
					name = sc.next();
					System.out.println("请输入密码： ");
					password = sc.next();
					register(name, password);
					break;
					
				case "2":
					System.out.println("请输入用户名： ");
					name = sc.next();
					System.out.println("请输入密码： ");
					password = sc.next();
					if(login(name, password))
						System.exit(0);
					break;
					
				case "3":
					System.out.println("谢谢你的使用，下次再见");
					System.exit(0);
					break;
					
				default:
					System.out.println("请输入1 或 2 或 3");
					System.exit(0);
					break;
				}
				
			}
	}
	
}

