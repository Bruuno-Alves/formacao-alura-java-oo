import java.util.ArrayList;
import java.util.List;

public class TesteArray {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();
		
		array.add(1);
		array.add(12);
		array.add(14);
		array.add(6);
		array.add(-91);
		
		int temp = array.get(1);
		
		System.out.println(temp);
	}

}
