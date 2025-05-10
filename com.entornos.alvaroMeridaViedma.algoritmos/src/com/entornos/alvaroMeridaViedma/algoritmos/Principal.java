package com.entornos.alvaroMeridaViedma.algoritmos;

public class Principal {

	public static void main(String[] args) {
		int lista[] = new int[3];
		boolean repetido = false;
		int random = 0;
		
		do {
			repetido = false;
			for (int i = 0; i < lista.length; i++) {
				random = (int)(Math.random() * 9)+2;
				lista[i] = random;
			}

			if (lista[0] == lista[1] || lista[0] == lista[2]
					|| lista[1] == lista[2])
				repetido = true;
		} while (repetido);
		
		
		// Check 1
//		for (int x = 0; x < lista.length; x++) {
//			System.out.println(lista[x]);
//			
//		}
		algoritmos f = new algoritmos() {};
		int resultadoFibonacci[] = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoFibonacci[i] = f.fibonacci(lista[i]);
		}
		
		//Check 2
//		for (int i = 0; i < resultadoFibonacci.length; i++) {
//			System.out.println("num: "+lista[i]);
//			System.out.println("f: "+resultadoFibonacci[i]);
//		}
		
		int resultadoFactorial[] = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoFactorial[i] = f.factorial(lista[i]);
		}
		
		//Check 3
//		for (int i = 0; i < resultadoFactorial.length; i++) {
//			System.out.println("num: "+lista[i]);
//			System.out.println("f: "+resultadoFactorial[i]);
//		}
		
		boolean resultadoPrimos[] = new boolean[lista.length];
		for (int i = 0; i < lista.length; i++) {
			resultadoPrimos[i] = f.primo(lista[i]);
		}
		
//		//Check 4
//		for (int i = 0; i < resultadoPrimos.length; i++) {
//			System.out.println("num "+i+": "+lista[i]);
//			System.out.println("P: "+resultadoPrimos[i]);
//		}
	}

}
