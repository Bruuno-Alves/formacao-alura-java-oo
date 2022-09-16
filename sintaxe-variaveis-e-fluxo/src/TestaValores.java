
public class TestaValores {

	public static void main(String[] args) {

		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		//Quanto vale o primeiro?
		System.out.println(segundo);
	}

}
