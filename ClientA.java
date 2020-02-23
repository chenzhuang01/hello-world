package Work06_ConcreteService;

public class ClientA {

	public static void main(String[] args) {
		
		AbstractServiceA asA = new ConcreteService();
		asA.operatorA();
		
	}
}
