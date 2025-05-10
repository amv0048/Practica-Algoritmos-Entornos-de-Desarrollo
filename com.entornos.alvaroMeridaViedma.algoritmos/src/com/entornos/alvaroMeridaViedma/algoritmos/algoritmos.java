package com.entornos.alvaroMeridaViedma.algoritmos;

public abstract class algoritmos {

	/**
	 * Calcula el factorial de un numero pasado como parametro
	 * @param num parametro a introducir
	 * @return entero con el factorial
	 */
	public int factorial(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else {
			int result = 1;
			for (int i = 1; i <= num; i++) {
				result *= i;
			}
			return result;
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
	    		if (num % 2 == 0) return false;
	    		for (int i = 3; i * i <= num; i++) {
					if (num % i == 0)
						return false;
				}
	    		return true;
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