package com.xihuani.algorithms;

public class Primes{public static boolean isPrime(int n){for(int i=2;i<n;i++){if(n%i==0){return false;}} return true;} public static Boolean isPrimeFaster(int n){if(n%2==0){return false;} int i;for(i=3;i*i<=n;i+=2){if(n%i==0){return false;}} return true;}}