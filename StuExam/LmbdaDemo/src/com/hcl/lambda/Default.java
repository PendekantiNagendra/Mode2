package com.hcl.lambda;

public interface Default {
	default void printHello() {
		System.out.println("Hello Default");
	}
	static void printHai(){
		System.out.println("Hai Static");
	}

}
