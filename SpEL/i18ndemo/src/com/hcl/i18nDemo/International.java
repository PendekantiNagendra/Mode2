package com.hcl.i18nDemo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class International {
	public static void main(String[] args) {
		double d = 98745632.201;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.CHINA);
		System.out.println("Italy representation of "+ d + ":" + nf.format(d));
		System.out.println("US representation of "+ d + ":" + nf1.format(d));
		System.out.println("CHINA representation of "+ d + ":" + nf2.format(d));
		System.out.println("Long Format of Date " + df.format(new Date()));
	}

}
