#include <stdio.h>
#include <math.h>
#define Pi 3.1416
 int main()
 {
 	double a,b,y,sum,i;
 	printf("������������ޣ�");
 	scanf("%lf",&a);
 	printf("������������ޣ�");
 	scanf("%lf",&b);
 	sum=0; 
 	for(i=0.00;i<=(b-a);i=i+0.001)
 	{
 		y=sin(a+i);
 		sum=y*0.001+sum;
 		
	 }
 	printf("sin x��%lf��%lf�Ķ�����Ϊ��%lf",a,b,sum);
 	return 0;
  } 
