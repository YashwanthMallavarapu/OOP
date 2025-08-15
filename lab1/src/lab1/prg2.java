package lab1;
import java.util.Scanner;

public class prg2 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a=inp.nextInt();
		int b=inp.nextInt();
		int temp;
		//int a=5,b=3,temp = 0;
		System.out.println("Tom have "+a+" and Jerry have "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.print("Tom have "+a+" and Jerry have "+b);
		
	}

}
