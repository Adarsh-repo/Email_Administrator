package emailapp;

import java.util.Scanner;

public class Email {
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private int mailBoxCapacity;
		private String alternateEmail;
		private int defPassLength = 9;
		private String email;
		private String companySuffix = "xyzcomapny.com";
		
		//constructor to recieve firsr name and last name
		public Email(String firstName, String lastName)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email created : "+this.firstName+" "+this.lastName); 
			
			//call a method asking for a department - return the department
			this.department = setDept();
			//System.out.println("Department : "+this.department);
			
			//call a method that returns a randm password
			this.password = randPass(defPassLength);
			System.out.println("Your password is : "+this.password);
			
			//create an Email
			email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
			System.out.println("Your email id is : "+email);
			
		}
		
		//Ask for department
		private String setDept()
		{
			System.out.println("Department Codes :\n1 for Slaes\n2 for Development\n3 for Accounting\n0 for None\nEnter department code : ");
			Scanner sc = new Scanner(System.in);
			int depChoice = sc.nextInt();
			if(depChoice == 1) {return "sales";}
			else if(depChoice == 2) {return "dev";}
			else if(depChoice == 3) {return "acc";}
			else {return "";}
		}
		
		//Generate a random password
		private String randPass(int length)
		{
			String passwordSet = "ABCDEFGHIJKLMNOPQrstuvwxyz1234567890!@#$%^&*";
			char password[] = new char[length];
			for(int i=0; i<length; i++)
			{
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
		//Set the mailbox capacity
		public void setMailboxCap(int cap)
		{
			this.mailBoxCapacity = cap;
		}
		
		//Set the alternate email
		public void setAltEmail(String altEmail)
		{
			this.alternateEmail = altEmail;
		}
		
		//Change the password
		public void setNewPassword(String password)
		{
			this.password = password;
		}
		
		public int getMailboxCapacity() {return mailBoxCapacity;}
		
		public String getAltEmail() {return alternateEmail;}
		
		public String getPassword() {return password;}

}
