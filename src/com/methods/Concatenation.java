package com.methods;

public class Concatenation {

	public static void main(String[] args) {
		String a="   kajal";
		String b="kadu";
		
		String c="hey,how are you,baby";
		//comparing
		System.out.println(a.equals(b));
		//concatenation
		//System.out.println(a+b);
		
		//splitting
		
		String[] d= c.split(",");
		
System.out.println(d[0]);

System.out.println(d[2]);
a.trim();
String x= a.trim();

	System.out.println(x);
	
	//substring
	
	System.out.println(b.substring(2));
	
	//length
	
	System.out.println(b.length());
	//upper case
	System.out.println(b.toUpperCase());
	
	}

}
