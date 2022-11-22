package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "     Bruno    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio);
		System.out.println(outroVazio);
		
		System.out.println(vazio.contains("un"));
		
		String nome = "Bruno"; //object literal
//		String outro = new String("Bruno");
		
		System.out.println(nome.length());
		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.print(nome.charAt(i) + " - ");
//		}
		
//		String sub = nome.substring(2);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("un");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		char c = 'B';
//		char d = 'b';
//		String outra = nome.replace(c, d);
		
//		String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
