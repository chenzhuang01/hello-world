package Work05_Client;

public class CipherB extends CipherA {
       
	  public String encrypt(String plainText) {
		byte[] byts = plainText.getBytes();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < byts.length; i++) {
			byts[i] -= 4;
			char a = (char)byts[i];
			sb.append(a);
		}
		  
		  return sb.toString();
		  
	  }
}
