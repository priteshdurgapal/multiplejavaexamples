package com.check.randome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegex {

	public static void main(String args[]) {
		String tstString = "7_7 ";
		String regex = "[A-Za-z0-9]+$";
		Pattern pattern = Pattern.compile("\\w^_+");
		Matcher matcher = pattern.matcher(tstString);
		if(!matcher.matches()) {
			System.out.println("doesnot match");
		}
		else {
			System.out.println("matches");
		}
		
	}
}
