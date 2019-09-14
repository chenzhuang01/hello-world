
package dingjifen;
import java.util.Scanner;
public class dingjifen {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double y,sum,i;
		System.out.println("请输入积分上限：");
		double a=sc.nextDouble();
		System.out.println("请输入积分下限：");
		double b=sc.nextDouble();
		sc.close();
		sum=0;
		for(i=0;i<=(b-a);i=i+0.001)
		{
			Math.sin(a+i);
			sum=Math.sin(a+i)*0.001+sum;
		}
		System.out.println("sin x的定积分从a到b的定积分是："+sum);
	}

}


