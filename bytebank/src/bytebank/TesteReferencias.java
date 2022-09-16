package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("agora a primeira conta tem " + primeiraConta.saldo);
		System.out.println("agora a segunda conta tem " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("s�o a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
