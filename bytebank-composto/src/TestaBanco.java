
public class TestaBanco {

	public static void main(String[] args) {

		Cliente bruno = new Cliente();
		bruno.nome = "Bruno Alves";
		bruno.cpf = "123.456.789-00";
		bruno.profissao = "programador";
		
		Conta contaDoBruno = new Conta();
		contaDoBruno.deposita(500);
		contaDoBruno.titular = bruno;
		
		System.out.println(contaDoBruno.titular.nome);
		System.out.println(contaDoBruno.titular);
		System.out.println(bruno);

	}

}
