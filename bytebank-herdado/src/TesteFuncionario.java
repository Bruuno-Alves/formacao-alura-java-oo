
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario bruno = new Gerente();
		bruno.setNome("Bruno Alves");
		bruno.setCpf("123.456.789-9");
		bruno.setSalario(2600.00);
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.getBonificacao());
		
	}

}
