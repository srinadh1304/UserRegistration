package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	public static boolean checkName(String name) {
		String nameValidation="^[A-Z][a-z]{2,}$";
		return Pattern.matches(nameValidation, name);
	}

	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*([^.]?$)*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	

	public static boolean checkMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("[0-9]{1,2}[\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public static boolean checkPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$");
		Matcher matcher = pattern.matcher(password);
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
		
		System.out.println("Enter Mobile number:");
		String mobileNumber = scanner.nextLine();
		if(checkMobileNumber(mobileNumber))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		System.out.println("Enter password:");
		String password = scanner.nextLine();
		if(checkPassword(password))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		String[] emails= {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.com","abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com",
				"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		for(int i=0;i<emails.length;i++) {
			System.out.println(checkEmail(emails[i]));
		}
		
		scanner.close();
	}
}
