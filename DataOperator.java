package Work05_Client;

import java.util.Scanner;

public class DataOperator {

	private CipherA cipherA;
	
	public CipherA setCipherA(CipherA cipherA, String s) {
		while(true) {
		      if(s.equals("A")) {
			        cipherA = new CipherA();
			        
			        return cipherA;
			  }else if(s.equals("B")) {
		        	cipherA = new CipherB();
		        	return cipherA;
		      }else {
			        System.out.println("������ 'A' �� 'B' ");
		      }
		}
	}
	
	public String encrypt(String plainText) {
		DataOperator data = new DataOperator();
		System.out.println("��������ѡ��ļ��ܷ�ʽ(A/B): ");
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    System.out.print("���ܺ�: ");
		cipherA = data.setCipherA(cipherA, s);
		String str = cipherA.encrypt(plainText);
		return str;
		
	}
}
