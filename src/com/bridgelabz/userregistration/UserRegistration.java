package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	public static boolean checkName(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}

	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName=scanner.nextLine();
		if(!checkName(firstName))
			System.out.println("Invalid ");
		else
			System.out.println("Valid ");
		

		System.out.println("Enter Last name");
		String lastName=scanner.nextLine();
		if(!checkName(lastName))
			System.out.println("Invalid ");
		else
			System.out.println("Valid ");
		
		System.out.println("Enter email:");
		String email=scanner.nextLine();
		if(checkEmail(email))
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
		scanner.close();
	}
}
