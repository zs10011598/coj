import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String n =  s.next();
		String m =  s.next();
		int a = 0;
		for (int i=0; i < n.length(); i++) {
			for (int j = 0; j < m.length(); j++){
				a += ((int) n.charAt(i) - '0')*((int) m.charAt(j) - '0');
			}
		}
		System.out.println(a);
	}
}