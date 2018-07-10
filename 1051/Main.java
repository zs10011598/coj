import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int d = 0;
		int r = N % 3;
		int q = N - r;
		d = 2*( (int) N / 3 );
		if (r == 2)
			d = d+1;
		System.out.println(d);
	}
}