package com.nagendra;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
		String res ;
		NagendraProxy nagendraProxy = new NagendraProxy();
		try {
			res=nagendraProxy.getName();
			System.out.println("Details are :" + res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
