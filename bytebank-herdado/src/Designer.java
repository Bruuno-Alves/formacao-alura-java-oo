
public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando a bonificação do Designer");
		return 200;
	}
	
}
