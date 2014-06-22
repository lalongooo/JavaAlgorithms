package com.xihuani.algorithms;

public class MainClass {

	public static void main(String[] args) {
		
		int counter = 0;
		int index = 2;		
		while (counter < 1000){
			if(Primes.isPrimeOne(index)){
				System.out.println(index);
				counter++;
			}
			index++;
		}

	}

}