package com.rishabkumar;

import java.rmi.RemoteException;

public class MainApplication {
	public static void main(String[] args) {
	String res;
	RishabKumarProxy rishabKumarProxy = new RishabKumarProxy();
	try {
		res = rishabKumarProxy.getRishab();
		System.out.println("Details are :" + res);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	

}
