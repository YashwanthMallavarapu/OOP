package lab3;
import java.util.Scanner;

public class prg3 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String str=inp.next();
		int vowels=0;
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
		}
		System.out.println("No of vowels : "+vowels);
		
	}

}
