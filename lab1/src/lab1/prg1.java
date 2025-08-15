package lab1;
import java.util.Scanner;
public class prg1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.print("Enter GST ");
		int gst=inp.nextInt();
		System.out.println("Enter Maintainance ");
		int mntc=inp.nextInt();
		System.out.println("Enter bill amount ");
		int bill=inp.nextInt();
		double discount;
		int total=gst+mntc+bill;
		if(total>1000) {
			discount=(bill/100)*10;
		}
		else {
			discount=(bill/100)*5;
		}
		double total_bill=bill-discount;
		
		System.out.println("Bill amount : "+bill);
		System.out.println("GST : "+gst);
		System.out.println("Maintainance Charges : "+mntc);
		System.out.println("Discount : "+discount);
		System.out.println("Total Bill : "+total_bill);
	}

}
