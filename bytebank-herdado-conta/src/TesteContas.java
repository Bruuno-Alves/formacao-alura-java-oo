
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(123, 123);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(321, 321);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
		
	}

}
