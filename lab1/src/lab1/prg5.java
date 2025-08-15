package lab1;
import java.util.Scanner;
public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=inp.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Given character is Uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Given character is Lowercase");
		}
		
		else
		{
			System.out.println("Invalid character");
		}
		

	}

}
