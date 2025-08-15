package lab2;

import java.util.Scanner;

public class prg1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sc=in.next();
		System.out.println("original string: "+sc);
		char character = sc.charAt(0);
		System.out.println("character at given index: "+character);
		int length=sc.length();
		System.out.println("length of the string: "+length);
		String uc=sc.toUpperCase();
		System.out.println("upper case: "+uc);
		String lc=sc.toLowerCase();
		System.out.println("Lower case: "+lc);
		String ss=sc.substring(3);
		System.out.println("substring: "+ss);
		boolean result=sc.contains("hi");
		System.out.println(result);
		String ns=sc.replace(sc, "hi");
		System.out.println("replaced string: "+ns);
		
	}

}
