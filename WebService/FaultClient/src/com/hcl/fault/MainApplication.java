package com.hcl.fault;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		HelloWorldProxy helloWorldProxy = new HelloWorldProxy();
		try {
			System.out.println(helloWorldProxy.sayHelloWorld(""));
		} catch (MissingName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
