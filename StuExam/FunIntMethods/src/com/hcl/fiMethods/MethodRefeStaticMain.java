package com.hcl.fiMethods;

public class MethodRefeStaticMain {
	public static void main(String[] args) {
		MethodRefeStatic mrs = (a) -> {
			return "Welcome :" + a;
		};
		System.out.println(mrs.sayHello(22));

		MethodRefeStatic mrs2 = MethodRefeStatic::someMethod;
		System.out.println(mrs2.sayHello(43));
	}

}
