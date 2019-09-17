package com.hcl.lambda;

public class Addition {
	public static void main(String[] args) {
		Addable A = (a,b) -> (a + b);
		System.out.println(A.add(4, 8));
	}

}
