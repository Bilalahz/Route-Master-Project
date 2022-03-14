import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Admin extends Rider {

	
	//add fund  //transfer fund  // withdraw fund 
	
	public static int Rider_count=0;
	public static int choice=0;
	public static int Num_of_Rider = 1000;
	public static Rider [] rider =new Rider[Num_of_Rider];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayMain();
	}

	private static void displayMain() {
		int option=-1;
		do
		{
			System.out.println("\nWelcome to Route Master\n"
					+ "Press '1' for Admin login\n"
					+ "Press '2' for Rider Login\n"
					+ "Press '3' for User Login\n"
					+ "Press'4' to close the application\n"
					+ "Enter");
			Scanner input =new Scanner(System.in);
			option = input.nextInt();
			input.nextLine();
			if(option == 1) {
				Adminlogin();
			}
			else if(option==2) {
				RiderLogin();
			}
			else if(option==3) {
				System.out.println("Thank you for using the system");
			}
			else {
				System.out.println("Invalid choice choose again");
			}
		}
		while( option != 3);
	}
	
	

	/*public static void AdminMenu() {
		System.out.println("\n---=== Manager Dashboard ===---\n"
				+ "Press '1' to Register a New Rider\n"
				+ "Press '2' to Edit Rider details\n"
				+ "Press '3' to Remove Rider (mark its status to disable\n"
				+ "Press '4' to List all Rider\n"
				+ "Press '5' to Go back to Main Menu\n"
				+ "Press '6' to Quit Application\n"
				+ "");
		
	}*/
    public static void Adminlogin() {
    	Scanner input = new Scanner (System.in);
    String password;
    	System.out.println("---===Login===---\n"
    			+ "username :>");
    	String uname = input.nextLine();
    	System.out.println("Password : >");
    	password = input.next();
    	
    	//password = input.nextLine();
    	if(uname.equals("admin")&& password.equals(123)) {
    		System.out.println("Authenticated successfully");
    		//AdminMenu();
    		AdminDashboard();
    	}
    	else {
    		System.out.println("username or password is incorrect\n");
    	}
    	
    }
	public static void AdminDashboard() {
		
		System.out.println("\n---=== Admin Dashboard ===---\n"
				+ "Press '1' to Register a New Rider\n"
				+ "Press '2' to Edit Rider details\n"
				+ "Press '3' to Remove Rider\n"
				+ "Press '4' to List all Rider\n"
				+ "Press '6' to Register a New User\n"
				+ "Press '7' to Edit User details\n"
				+ "Press '8' to Remove User \n"
				+ "Press '9' to List all User\n"
				+ "Press '10' to Go back to Main Menu\n"
				+ "Press '11' to Quit Application\n"
				+ "");
		

		Scanner input = new Scanner(System.in);
		do {
			RiderMenu();{
				choice = input.nextInt();
				switch (choice) {
				case 1: 
				{
					
					if(Rider_count > 999) {
						System.out.println("No space left to add more rider");
						break;
					}
					rider[Rider_count]= new Rider();
					rider[Rider_count].addRider();
					Rider_count++;
					break;
					}
					case 2: 
						/*if(Rider_count ==0) {
							System.out.println("No Rider is registered yet");
							break;
						}
						System.out.println("\n---=== Showing Current Riders ===---");
						for(int i =0; i < Rider_count; i++) {
							rider[i].viewRider();
						}
						System.out.println("Enter customer ID to Edit :> ");
						
						int tmp_id = input.nextInt();
						tmp_id -=1001;
						
						rider[tmp_id].editRider(tmp_id);
						break;*/
						System.out.println("Coming Soon, Stay Tuned");
					case  3:
						if(Rider_count ==0) {
							System.out.println("No customer is registered yet");
							break;
						}
						System.out.println("Please choose an account number");
						for(int i=0; i < Rider_count; i++) {
							rider[i].viewRider();
						}
						System.out.println("Enter Rider_ID to Delete");
						int tmp_id = input.nextInt();
					
						rider[tmp_id]= null;
						break;
					case 4:
					if(Rider_count == 0) {
						System.out.println("No customer is registered yet");
						break;
					}
					for(int i=0; i < Rider_count; i++) {
						rider[i].viewRider();
					}
					break;
					case 10:
						displayMain();
						break;
					case 11:
						System.out.println("It was our pleasure to serve you, thankyou! ");
						System.exit(0);
						break;
				}
				}
			}
			while(choice!=6);
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean validateEmail (String em) {
		return false;
	}

	private int getnewID() {
		return ++Rider_count;
	}

	public void addRider() {
		
		Console console = System.console();
		
		Scanner input =new Scanner(System.in);
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





	
	
	
	
	
	
	
	
	public static void RiderMenu() {
		System.out.println("\n---=== Customer Dashboard ===---\n"
				+ "Press '1' Withdraw Fund\n"
				+ "Press '2'  Balance Check\n"
				+ "Press '3' Transfer Fund\n");
		
	}
	public static void RiderLogin() 
	 {
		Rider Acustomer=new Rider();
		Scanner input = new Scanner (System.in);
		RiderMenu();
		 choice = input.nextInt();
			switch (choice) {
			case 1: 
			{
				System.out.println("Enter amount to withdraw");
				double withdrawAmm= input.nextInt();
				if (Acustomer.balance>=withdrawAmm) 
				{
					System.out.println("Transaction Successful");
					Acustomer.balance = Acustomer.balance-withdrawAmm;
					break;
				}
				else
				{
				System.out.println("you are out of Balance");	
				}
				
				break;
				}
		 
			case 2: 
			{
				System.out.println("Your balance is "+Acustomer.balance);
				break;
			}
			case 3:
			{
				System.out.println("Enter Id to transfer Cash ");
				Acustomer.account_id =input.nextInt();
				break;
				
			}
		 
	 
			}
	 
	 }
	
}