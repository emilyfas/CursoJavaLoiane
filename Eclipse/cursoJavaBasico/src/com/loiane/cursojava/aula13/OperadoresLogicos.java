package com.loiane.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;
		
		/*boolean resultado1 = (valor1 == 1) & (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 " + resultado1);
		
		boolean resultado2 = (valor1  == 1) | (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 " + resultado2);*/
		
		boolean resultado3 = (valor1 == 1) ^ (valor2 == 2);
		System.out.println("valor1 é 1 XOR valor2 é 2 " + resultado3);
		
		boolean resultado4 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR circuito valor2 é 2 " + resultado4);
		
		boolean resultado5 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND circuito valor2 é 2 " + resultado5);
		
		boolean resultado6 = !(valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 NOT valor2 é 2 " + resultado6);
		
		
	}

}
