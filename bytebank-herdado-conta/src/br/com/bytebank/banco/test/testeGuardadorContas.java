package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class testeGuardadorContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 13);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
