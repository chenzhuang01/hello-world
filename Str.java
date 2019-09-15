package com;

import java.util.Random;

public class Str {
	public static void main(String[] args) {
		String[] s1 = new String[] {"44444", "7155","844891","4984623",
				"9964987", "4981919", "4966563", "0", "11", "223",
				"3348", "584770"};
		String[] s2 = new String[] {"laoshi", "xuesheng", "chuzi", 
				"jiaoshou", "shangren", "yisheng", "chengxuyuan", 
				"gongchengshi", "laoban", "siji", "gongwuyuan", 
				"lvshi"};
		String[] s3 = new String[] {"xiaoming", "xiaohong", "sunwukong", 
				"baigujing", "xiaoxuanfeng", "heima", "tangseng", "tangsanzang",
				"zhubajie", "shaheshang", "shaseng", "bailongma"};
		
		Random a = new Random();
		int b = a.nextInt(12);	
		int d = a.nextInt(12);
		int e =a.nextInt(12);
		String c = s1[b] + s2[d] + s3[e];
		
		System.out.println("连接的字符串为："+c); 
		System.out.println("连接的字符串长度为："+c.length());
		
	}

}
