package com.entornos.alvaroMeridaViedma.algoritmos;

public abstract class algoritmos {

	
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
}