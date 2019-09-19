package com.hcl.helloservice.endpoint;

import java.rmi.RemoteException;

public class Main {
	public static void main(String[] args) {
		HelloProxy helloProxy = new HelloProxy();
		try {
			System.out.println(helloProxy.sayHello("Nagendra"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
