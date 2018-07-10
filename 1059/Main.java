import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		String bin = "";
		int len = 0;
		int sum = 0;
		while(scan.hasNextInt()) {
			n = scan.nextInt();
			if(n == 0) break;
			bin = Integer.toBinaryString(n);
			len = bin.length();
			sum = 0;
			for (int i =0 ; i < len; i++) {
				if(bin.charAt(i) == '1') 
					sum += 1;
			}
			System.out.println("The parity of " + bin + " is " + sum + " (mod 2).");
		}
	}
}