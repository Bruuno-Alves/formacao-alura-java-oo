import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Scores {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read the name from the input
		String input_from_question = br.readLine();

		// Write your answer here
		String[] entrada = input_from_question.split(" ");
		int preco = entrada[0].startsWith("1") ? 50 : 100;
		int quant = Integer.parseInt(entrada[1]);
		int total = preco * quant;

		if (total > 5000) {
			total *= 0.9;
		}
		// print the Output
		System.out.println(total);

	}

	public static int[] find_elements(int arr[], int n) {
		int[] missing_repeat = new int[2];
		// Write your code here without removing the existing code
		// the variable 'arr' contains array of integers of size n.
		// modified the array 'missing_repeat' having missing and repeating element.
		Arrays.sort(arr);
		for(int i = 1; i < n; i++) {
			if(arr[i] == arr[i-1]) {
				missing_repeat[1] = arr[i];			}
		}
		
		int soma = 0;
		for(int num: arr) {
			soma += num;
		}
		soma -= missing_repeat[1];
		
		int esperado = 0;
		for (int i = 1; i <= n; i++) {
			esperado += i;
		}
		
		missing_repeat[0] = esperado - soma;
		
		return missing_repeat;
	}

}
