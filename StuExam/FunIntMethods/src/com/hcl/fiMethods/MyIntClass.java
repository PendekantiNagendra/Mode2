package com.hcl.fiMethods;

import java.util.function.Consumer;

public class MyIntClass {
	public static void main(String[] args) {
		
		MyInterface min = (a) -> {System.out.println(a);};
		min.someMethod("HCL");
		
		MyInterface min2 = System.out::println;
		min2.someMethod("Java CoE");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Bye");
	}

}
