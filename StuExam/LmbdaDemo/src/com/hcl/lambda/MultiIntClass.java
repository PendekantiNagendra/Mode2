package com.hcl.lambda;

public class MultiIntClass {
	public static void main(String[] args) {

		MultiInterface min = (name) -> {
			return "Hello" + name;
		};
		System.out.println("Hello " + "Nag");

		System.out.println("Static Method :" + MultiInterface.add(4, 7));

		MultiInterface min2 = (String str) -> ("Hello");
		System.out.println(min.equals(min2));

		System.out.println("Default Method " + min.defaultMethod(44));

	}
}