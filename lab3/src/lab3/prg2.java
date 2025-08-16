package lab3;
import java.util.Scanner;
public class prg2 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String name=inp.nextLine();
		int n=name.length();
		
		for(int i=0;i<n;i++) {
			System.out.println(name.charAt(i));
		}
	}

}
