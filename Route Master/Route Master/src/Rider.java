import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rider {

public String name;
public static int rider_Count = 0;
public int rider_id;
public String PIN;
public String phone_no;
public String email_address;
public String  Vehicle;

Scanner input =new Scanner(System.in);
/*public String locations()
{
	
	System.out.println("Enter ");
	
	
	
	return null;
	
}*/

public boolean validateEmail (String em) {
	return false;
}

private int getnewID() {
	return ++rider_Count;
}

public void addRider() {
	
	Console console = System.console();
	
	
	System.out.println("\n ---=== Add New Rider ===---\n" + "Enter Name:");
	this.name=input.nextLine();
	System.out.println("Enter PIN");
	this.PIN=input.next();
	
	 
	this.rider_id= getnewID();
	System.out.println(this.rider_id );
	
	System.out.println("Enter Phone No. :> ");
	this.phone_no =input.nextLine();
	
	System.out.println("Enter Vehicle. :> ");
	this.Vehicle =input.nextLine();
	
	System.out.println("Enter Email Address:> ");
	this.email_address=input.nextLine();
	
	if(isEmailValid(this.email_address) == true) {
		System.out.println("Email address is valid\n");
}
else {
	System.out.println("Invalid Email address");
	}
	
	
}


/*public void edit_Rider(int rider_id) {
	
	
	
	Scanner input= new Scanner(System.in);
	System.out.println("\n ---=== Add New Rider ===---\n" + "Enter Name:");
	this.name= input.nextLine();
	
	System.out.println("Enter PIN");
	this.PIN=input.next();
	
    this.rider_id=rider_id;
    input.nextLine();
    System.out.println("Enter Phone No :> ");
    this.phone_no=input.nextLine();
    //input.nextLine();
    System.out.println("Enter Email Address:> ");
    this.email_address=input.nextLine();
    if( isEmailValid(this.email_address) == true) {
    	System.out.println("Email address is valid\n");
    }
    else {
    	System.out.println("Invalid Email address");
    	
    }
}*/


public void viewRider () {
	
	
	System.out.println("Username:" + this.name);
	System.out.println("Account ID:" + this.rider_id);
	System.out.println("Phone No.:" + this.phone_no);
	System.out.println("Email Address:" + this.email_address);
}



 public boolean isEmailValid(String em) {
	 String expression = "^[a-zA-Z0-9_!#$%&*+/=?{|}`^.-]+@[a-zA-Z0-9.-]+4";
	 
	 CharSequence inputstr=em;
	 Pattern pattern = Pattern.compile(expression);
	 Matcher matcher = pattern.matcher(inputstr);
	 if(matcher.matches())
	 {
		 return true;
	 }
	 return false;
 }
 
 
 

public void deleteRider() {
	
}






public void User_location() {

	System.out.println("Enter the starting location");
	String Starting_Location=input.nextLine();
	System.out.println("Enter your Drop off location");
	String Dropoff_Location=input.nextLine();
	
}


}
