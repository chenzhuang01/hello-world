package Work04_Login;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException{
		LoginForm lf = new LoginForm();
		String name;
		String password;
		while(true) {
                                                lf.init();
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.next();
			switch(choiceString) {
			case "1":
				System.out.println("�������û����� ");
				name = sc.next();
				System.out.println("���������룺 ");
				password = sc.next();
				lf.register(name, password);
				break;
				
			case "2":
				System.out.println("�������û����� ");
				name = sc.next();
				System.out.println("���������룺 ");
				password = sc.next();
				if(lf.login(name, password))
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
