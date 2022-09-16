package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoBruno = new Conta();
		contaDoBruno.saldo = 100;
		
		contaDoBruno.deposita(50);
		
		System.out.println(contaDoBruno.saldo);
		
		boolean conseguiuSacar = contaDoBruno.saca(30);
		
		System.out.println(contaDoBruno.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoDaTransferencia = contaDaMarcela.transfere(3000, contaDoBruno);
		
		if(sucessoDaTransferencia) {
			System.out.println("transferência com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoBruno.saldo);
	}

}
