import java.util.Scanner;

public class FatorialDesajeitado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int resultado = fatorial(n);

		System.out.println("o resultado é: " + resultado);
	}

	private static int fatorial(int n) {
		int resultado = n;
		int contador = n - 1;
		
		while(contador > 1) {
			if (contador != 0) return resultado;
			resultado *= contador;
			contador--;
			if (contador != 0) return resultado;
			resultado /= contador;
			contador--;
			if (contador != 0) return resultado;
			resultado += contador;
			contador--;
			if (contador != 0) return resultado;
			resultado -= contador;
			contador--;
		}
		
		return resultado;
	}

}
