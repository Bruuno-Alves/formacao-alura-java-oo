
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		
		g1.setNome("Carlos");
		g1.setSalario(5000.0);;
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500.0);
		
		Designer ds = new Designer();
		ds.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ds);
		
		System.out.println(controle.getSoma());
		
	}

}
