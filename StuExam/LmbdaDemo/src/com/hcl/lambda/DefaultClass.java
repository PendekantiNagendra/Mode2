package com.hcl.lambda;

public class DefaultClass implements Default {
	public static void main(String[] args) {
		new DefaultClass().printHello();
		Default.printHai();
	}
}