package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 56 + 20;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 5;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado  + 5;
		System.out.println(resultado);
	
		resultado = resultado % 3;
		System.out.println(resultado);
		
		String frase1 = "Esta é";
		String frase2 = " uma String concatenada.";
		String fraseCompleta = frase1 + frase2;
		System.out.println(fraseCompleta);
			
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//2
		System.out.println(resultado++);
		//print
		//resultado += 1;
		
		System.out.println(++resultado);
		//resultado += 1;
		//print
	}

}
