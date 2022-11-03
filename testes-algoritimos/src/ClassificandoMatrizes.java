import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int i;
		int N = scan.nextInt();
		int[] nums = new int[N];
		for (i = 0; i < N; i++) {
			nums[i] = scan.nextInt();
		}
		
		nums = ordenar(nums, N);
		
		for(int num: nums) {
			System.out.println(num);
		}

	}

	public static int[] ordenar(int nums[], int comp) {
		int aux = 0;
		for (int i = 0; i < comp; i++) {
			for (int j = i + 1; j < comp; j++) {
				if(nums[i] % 2 != 0 && nums[j] % 2 == 0) {
					aux = nums[i];
					nums[i] = nums[j];
					nums[j] = aux;
					break;
				}
			}
		}
		return nums;
	}
}
