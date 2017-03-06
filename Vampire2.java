package com.bingbing.chapter4;

public class Vampire2 {
	
	private int a(int i){
		return i/1000;
	}
	
	private int b(int i){
		return (i%1000)/100;
	}
	
	private int c(int i){
		return ((i%1000)%100)/10;
	}
	
	private int d(int i){
		return ((i%1000)%100)%10;
	}
	
	private int com(int i,int j){
		return i*10+j;
	}
	
	private void checkMultiply(int i,int j,int n){
		if(n == i*j)
			System.out.println(n+" = "+i+" * "+j);
	}
	
	public void doIt(){
		for(int i = 1001 ; i < 9999 ; i ++){
			checkMultiply(com(a(i),b(i)),com(c(i),d(i)), i);
			checkMultiply(com(a(i),b(i)),com(d(i),c(i)), i);
			checkMultiply(com(b(i),a(i)),com(c(i),d(i)), i);
			checkMultiply(com(b(i),a(i)),com(d(i),c(i)), i);
			checkMultiply(com(a(i),c(i)),com(b(i),d(i)), i);
			checkMultiply(com(a(i),c(i)),com(d(i),b(i)), i);
			checkMultiply(com(c(i),a(i)),com(b(i),d(i)), i);
			checkMultiply(com(c(i),a(i)),com(d(i),b(i)), i);
			checkMultiply(com(a(i),d(i)),com(b(i),c(i)), i);
			checkMultiply(com(a(i),d(i)),com(c(i),b(i)), i);
			checkMultiply(com(d(i),a(i)),com(b(i),c(i)), i);
			checkMultiply(com(d(i),a(i)),com(c(i),b(i)), i);
		}
	}
	
}
