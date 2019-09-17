package com.hcl.lambda;

public class withoutLambdaExpression {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void sayMessage() {
				System.out.println("Welcome to My Interface");
				
			}
		};
		myInterface.sayMessage();
	}

}
