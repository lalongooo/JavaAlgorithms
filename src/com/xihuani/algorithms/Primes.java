package com.xihuani.algorithms;

public class Primes {
	
	public static boolean isPrimeOne(int n){
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}

}
