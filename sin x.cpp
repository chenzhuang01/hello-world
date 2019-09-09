#include <stdio.h>
#include <math.h>
#define Pi 3.1416
 int main()
 {
 	double a,b,y,sum,i;
 	printf("请输入积分上限：");
 	scanf("%lf",&a);
 	printf("请输入积分下限：");
 	scanf("%lf",&b);
 	sum=0; 
 	for(i=0.00;i<=(b-a);i=i+0.001)
 	{
 		y=sin(a+i);
 		sum=y*0.001+sum;
 		
	 }
 	printf("sin x从%lf到%lf的定积分为：%lf",a,b,sum);
 	return 0;
  } 
