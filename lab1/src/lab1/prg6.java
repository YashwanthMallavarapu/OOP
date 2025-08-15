package lab1;
import java.util.Scanner;
public class prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("ENter an alphabet");
		char ch=inp.next().charAt(0);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("It is a vowel ");
		}
		else
		{
			System.out.println("It is a consonent ");
		}
		

	}

}
