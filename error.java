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
//Console��ʾ��Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11
//at error.error.main(error.java:6)
//�̡߳�main���е��쳣���±�Խ���쳣����error��java�ĵ����С�
//ԭ�������������Ŵ�0��ʼ��һֱ������ĳ��ȼ�һ�����Դ����ж��������ʵ�ʷ�ΧΪ0����9.
//����������޸ĳɴ��ڵ���ȷ������š�
//ע�͵���6��7��9�У�������8���е�11�޸�Ϊ0����9�е�����һ�����֣�Console����ʾΪ0.