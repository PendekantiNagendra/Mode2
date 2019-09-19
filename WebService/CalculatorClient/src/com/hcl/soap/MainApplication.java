package com.hcl.soap;

import java.rmi.RemoteException;

import com.RishabProxy;
import com.satya.SatyaProxy;

public class MainApplication {
	public static void main(String[] args) {
		int res = 0;
		int res2 = 0;
		RishabProxy rishabProxy = new RishabProxy();
		SatyaProxy satyaProxy = new SatyaProxy();
		try {
			res = rishabProxy.getSap();
			res2 = satyaProxy.getSap();
			CalculatorProxy calculatorProxy = new CalculatorProxy();
			System.out.println(rishabProxy.getSap());
			System.out.println(satyaProxy.getSap());
			System.out.println("Details are :" +calculatorProxy.add(res, res2));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
