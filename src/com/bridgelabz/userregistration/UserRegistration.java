package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	public static boolean nameValidation(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}

	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	

	public static boolean checkMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("[1-9][0-9][\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName=scanner.nextLine();
		if(!nameValidation(firstName))
			System.out.println("Invalid ");
		else
			System.out.println("Valid ");
		

		System.out.println("Enter Last name");
		String lastName=scanner.nextLine();
		if(!nameValidation(lastName))
			System.out.println("Invalid ");
		else
			System.out.println("Valid ");
		
		System.out.println("Enter email:");
		String email=scanner.nextLine();
		if(checkEmail(email))
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
		
		System.out.println("Enter Mobile number:");
		String mobileNumber = scanner.nextLine();
		if(checkMobileNumber(mobileNumber))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		scanner.close();
	}
}
