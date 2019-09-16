package error;

public class error {
	public static void main(String[] args) {
		int [] a=new int[10];
	//	a[11]=3;
		//int b=a[20];
		System.out.println(a[8]);
	//	System.out.println(b);
		
	}

}
//Console显示：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
//at error.error.main(error.java:6)
//线程“main”中的异常，下表越界异常，在error。java的第六行。
//原因：数组的索引编号从0开始，一直到数组的长度减一，所以代码中定义的数组实际范围为0——9.
//解决方案：修改成存在的正确索引编号。
//注释掉第6，7，9行，并将第8行中的11修改为0——9中的任意一个数字，Console中显示为0.