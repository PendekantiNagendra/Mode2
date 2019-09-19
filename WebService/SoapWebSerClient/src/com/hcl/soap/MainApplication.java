package com.hcl.soap;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		int result = 0;
		int result2 = 0;
		CalculatorProxy calculatorProxy = new CalculatorProxy();
		CalculatorProxy calculatorProxy2 = new CalculatorProxy();
		  try {
			  result = calculatorProxy.mult(2, 4);
			  result2 = calculatorProxy2.add(2, 4);
			  System.out.println("Mult of 2 numbers is :" + result);
			  System.out.println("Addition of 2 numbers is :" + result2);
		  } catch(RemoteException e) {
			  e.printStackTrace();
		  }
	}

}
