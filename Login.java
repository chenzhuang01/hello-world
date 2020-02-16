package Work04_Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {

	//  �����û���Ϣ��·��
	public static String fileName= "E:\\����\\�û���Ϣ.txt";
	
	//matchName��matchPassWord���ݵ���Ϣ : (��¼�ȶ��Ѿ����ϵ�match����)
	//�����Ѵ����û�������
	public static String userPassWord = null;
	
	//match �� login ���ݵ���Ϣ
	//�û����������������
	//�û������󲻻��޸�flag
	public static boolean flag = false;
	
	// �û���Ϣ��ʽΪname,password(һ��һ��)
	/*
	 * ��¼
	 * 
	 */
	public static boolean login(String name, String password) throws IOException{
		if(findUser(name, password)) {
			System.out.println("��ӭ"+name+", ��¼�ɹ�");
			return true;
		}
		if(flag == true) {
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
	public static void register(String name, String password) throws IOException{
		//�ȶ�����
		if(findName(name)) {
			System.out.println("�û����Ѿ����ڣ�������������");
			return;
		}
		
		//û������˿��Լ���ע��
		//���û���Ϣд�뵽�ļ��У��ô���append�Ĺ��췽��
		//ƴ���û���Ϣ
		String userInfo = name + "," + password;
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//�Ȼ��У���д��
		//���ǵ�һ��д�룬�Ͳ��û���
		if(new File(fileName).length()==0) {
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
	
	/*
	 * ���ļ������Ƿ���ڴ���
	 * @return ƥ��ɹ����
	 * 
	 */
	public static boolean findName(String name) throws IOException{
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
	
	public static boolean findUser(String name, String password) throws IOException{
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
	
	public static void main(String[] args) throws IOException{
			String name;
			String password;
			while(true) {
				System.out.println("-------------��ӭ����-------------");
				System.out.println("1. ע��");
				System.out.println("2. ��¼");
				System.out.println("3. �˳�");
				System.out.println("���������ѡ�� ");
				Scanner sc = new Scanner(System.in);
				String choiceString = sc.next();
				switch(choiceString) {
				case "1":
					System.out.println("�������û����� ");
					name = sc.next();
					System.out.println("���������룺 ");
					password = sc.next();
					register(name, password);
					break;
					
				case "2":
					System.out.println("�������û����� ");
					name = sc.next();
					System.out.println("���������룺 ");
					password = sc.next();
					if(login(name, password))
						System.exit(0);
					break;
					
				case "3":
					System.out.println("лл���ʹ�ã��´��ټ�");
					System.exit(0);
					break;
					
				default:
					System.out.println("������1 �� 2 �� 3");
					System.exit(0);
					break;
				}
				
			}
	}
	
}

