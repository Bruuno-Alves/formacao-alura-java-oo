package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) {

		int idade = 32; //Integer
		Integer idadeRef = new Integer(29); //Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); //Unboxing
		String s = args[0]; //"12"
//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(29); //Autoboxing
	}

}
