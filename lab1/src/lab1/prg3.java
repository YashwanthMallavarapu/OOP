package lab1;
import java.util.Scanner;
public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=inp.nextInt();
		for(int i=1;i<=n;i++)
		{
			double sqrt=Math.sqrt(i);
			System.out.println("The Square root of "+i+" is "+sqrt);
		}

	}

}
