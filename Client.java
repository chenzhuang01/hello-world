package Work05_Client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException{
		  FileReader file = new FileReader("E:\\����\\�û���Ϣ.txt");
		  BufferedReader br = new BufferedReader(file);
		  StringBuilder sb = new StringBuilder();
		  String line = null;
		  while((line = br.readLine())!= null) {
			  sb.append(line);
			  
		  }
		  br.close();
		  System.out.println("����ǰ: " + sb.toString());
		  DataOperator dataoperator = new DataOperator(); 
		  System.out.println(dataoperator.encrypt(sb.toString()));
	       
	}
}
