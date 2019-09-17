package com.hcl.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Hai");
		ls.add("I am");
		ls.add("Nagendra");
		ls.forEach((action) -> System.out.println(action));
	}

}
