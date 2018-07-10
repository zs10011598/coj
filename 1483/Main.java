import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String fig = scan.next();
		int n = scan.nextInt();
		if (scan.hasNextInt())
			System.out.println(n*scan.nextInt());
		else
			System.out.println(n*n);
	}
}
