
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voc� � maior de idade");
			System.out.println("seja bem vindo");
		} else if (quantidadePessoas >= 3) {
			System.out.println("voc� n�o � maior de idade, mas est� acompanhado, ent�o pode entrar");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}

}
