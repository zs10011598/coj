import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCases = scan.nextInt();
		int pointer = 0;
		int lenNum = 0;
		int div = 0;
		String number = "";
		for(int i = 0; i < numCases; i++) {
			number = scan.next();
			lenNum = number.length();
			if ((int) (number.charAt(lenNum - 1) - '0') % 2 == 1){
				System.out.println("NO");
				continue;
			} 
			pointer = 0;
			div = 0;
			for(int j = 0; j < lenNum; j++) {
				pointer += (int) (number.charAt(j) - '0');
				div = (int) (pointer / 2);
				if(pointer % 2 == 1) pointer = 10;
				else pointer = 0;
			}
			if (pointer % 2 == 0 && div % 2 == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}