import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while (true){
			int a = Math.abs(scan.nextInt());
			if (a == 0) {
				break;
			}
			int b = Math.abs(scan.nextInt());
			int c = Math.abs(scan.nextInt());
			int hip = 0;
			int cat1 = 0;
			int cat2 = 0;

			if (a >= b && a >= c){
				//System.out.println(a);
				hip = a;
				cat1 = b;
				cat2 = c;
			} else if(b >= a && b >= c){
				//System.out.println(b);
				hip = b;
				cat1 = a;
				cat2 = c;
			} else {
				//System.out.println(c);
				hip = c;
				cat1 = b;
				cat2 = a;
			}

			if (cat1*cat1 + cat2*cat2 == hip*hip) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		
	}
}