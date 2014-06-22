package com.xihuani.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
				
		
		
		int counter = 0;
		int index = 2;
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
		
		while (counter < 1000){
			if(Primes.isPrimeFaster(index)){
				System.out.println(index);
				counter++;
			}
			index++;
		}
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
		
		/*
		 * Results using the isPrimeOne method.
		 * 2014-06-22 00:55:14.593
		 * 2014-06-22 00:55:18.434
		 * 
		 * Results using the isPrimeOne method.
		 * 2014-06-22 00:55:50.200
		 * 2014-06-22 00:55:50.575
		 * 
		 * */


	}

}