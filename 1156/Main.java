import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;

		while(scan.hasNextInt()){
			n = scan.nextInt();

			if (n == 42) {
				break;
			} else {
				System.out.println(n);
			}
		}

	}
} 