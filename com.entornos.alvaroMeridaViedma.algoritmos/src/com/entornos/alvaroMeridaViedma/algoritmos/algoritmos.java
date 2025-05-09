package com.entornos.alvaroMeridaViedma.algoritmos;

public abstract class algoritmos {

	/**
	 * Calcula el factorial de un numero pasado como parametro
	 * @param num parametro a introducir
	 * @return lista de numeros multiplicados y el resultado
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
}