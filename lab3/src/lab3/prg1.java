package lab3;
import java.util.Scanner;
public class prg1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String str=inp.next();
			StringBuilder sb=new StringBuilder(str);
			StringBuilder rev=new StringBuilder(str).reverse();
		if(sb.toString().equals(rev.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
