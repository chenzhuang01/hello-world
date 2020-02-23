package Work06_ConcreteService;

public class ConcreteService implements AbstractServiceA, AbstractServiceB, AbstractServiceC {

	
	public void operatorA() {
		System.out.println("我想要一瓶可乐");
	}

	
	public void operatorB() {
		System.out.println("我想要一个汉堡");
	}

	
	public void operatorC() {
		System.out.println("我想要一个苹果");
	}

}
