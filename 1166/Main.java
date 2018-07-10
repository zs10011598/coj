import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int nc = s.nextInt();
		int nn = 0;
		int ne = 0;
		int no = 0;
		int n = 0;
		for(int i = 0; i < nc; i ++){
			nn = s.nextInt();
			ne = 0;
			no = 0;
			for (int j =0 ; j < nn; j++){
				n = s.nextInt();
				if(n % 2 == 0) ne ++;
				else no ++;
			}
			System.out.println(ne + " even and " + no + " odd.");
		}
	}
}