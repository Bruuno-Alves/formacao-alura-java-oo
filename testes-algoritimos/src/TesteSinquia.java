import java.util.Scanner;

public class TesteSinquia {

	public static void main(String[] args) {

		int n, i, t, e;
		double a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		n = scan.nextInt();
		
		i = 0;
		t = 0;
		
		while (i < n) {
			System.out.println("Escreva um numerp");
			e = scan.nextInt();
			
			t = t + e;
			i = i + 1;
		}
		
		a = t;
		System.out.println(i+ " "+ a);
		
	}

}
