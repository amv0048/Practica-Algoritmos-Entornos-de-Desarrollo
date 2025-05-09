package com.entornos.alvaroMeridaViedma.algoritmos;

public abstract class algoritmos {

	/**
	 * Calcula el factorial de un numero pasado como parametro
	 * @param num parametro a introducir
	 * @return entero con el factorial
	 */
	public String factorial(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else {
			String res ="";
			int result = 1;
			
			for (int i = 1; i <= num; i++) {
				res += result + ", ";
				result *= i;
			}
			return res+ ": "+result;
		}
	}
	
	/**
	 * Devuelve si un numero es primo o no
	 * @param num parametro a introducir
	 * @return true o false
	 */
	public boolean primo(int num){
	    boolean primo = false;
	    if (num < 2)
	        throw new IllegalArgumentException();
	    else {
	        int cont = 2;
	        do {
	            primo = num % cont == 0 ? false : true;
	            cont++;
	        } while (!primo && cont <= 7);
	        return primo;
	    }
	}
	
	/**
	 * Devuelve el numero fibonacci del numero pasado por parametro
	 * @param num parametro a introducir
	 * @return
	 */
	public int fibonacci(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else {
			int f0 = 0, f1 = 1;
			for (int i = 2; i <= num; i++) {
				int f2 = f0 + f1;
				f0 = f1;
				f1 = f2;
			}
			return f1;
		}
	}
}