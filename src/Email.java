package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "company.com";
	
	//Constructor to receive the first and last name
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	//Call a method to ask for the department - return the department
	this.department = setDepartment();
	
	
	//Call a method that returns a random password
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your Password is "+ this.password);
	
	
	//combine elements to generate email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ '@' + department + "." + companySuffix;

	
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("NEW WORKER: "+firstName + "," +" DEPARTMENT CODES " +  " \n 1 for sales \n 2 for development \n 3 for accounting\n 0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "Development";}
		else if(depChoice == 3){return "Accounting";}
		else {return ""; }
	
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {int rand = (int) (Math.random() * passwordSet.length()); password[i] = passwordSet.charAt(rand);}
		return new String (password);
	}
		
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity = capacity;
		
	}
	
		
	//Set the alternate Email
	public void setAlternateEmail(String altemail) {
		this.alternateEmail= altemail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	

}
	
	public int getMailBoxCapacity() {return mailboxcapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + "" + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxcapacity + " mb";}
	}

