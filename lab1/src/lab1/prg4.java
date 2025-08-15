package lab1;
import java.util.Scanner;
public class prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=inp.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("The given number "+n+" is a perfect number");
		}
		else
		{
			System.out.println("The given number "+n+" is not a perfect number");
		}
		

	}

}
