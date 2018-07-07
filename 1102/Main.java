import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nDigits = 0;
		int sum = 0;
		String number = "";
		while(scan.hasNextLine()){
			number = scan.nextLine();
			if(number.equals("0")) break;
			nDigits = number.length();
			sum = 0;
			for(int i = 0; i < nDigits; i++){
				if(i % 2 == 0) 
					sum += (int) (number.charAt(i) - '0');
				else
					sum -= (int) (number.charAt(i) - '0');
			}
			if(sum % 11 == 0) 
				System.out.println(number + " is a multiple of 11.");
			else 
				System.out.println(number + " is not a multiple of 11.");
		}
	}
}