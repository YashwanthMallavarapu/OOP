package lab2;
import java.util.Scanner;
public class prg3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=in.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		int h=0,l=0;
		h=ar[0];
		l=ar[0];
		for(int i=0;i<n;i++) {
			if(ar[i]>h)
			{
				h=ar[i];
			}
			if(ar[i]<l)
			{
				l=ar[i];
			}
		}
		System.out.println("Lowest is "+l+" largest is "+h);
		

	}

}
