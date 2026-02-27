package system;

import java.util.Scanner;
import java.util.ArrayList;
import cswk.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;


public class systemClass {	
	
	    public static void main(String[] args) {
	    	
	    	ArrayList<Staff> staffList= new ArrayList<Staff>();
	    	 		    	
	    	//clearFile();
	        Scanner scanner = new Scanner(System.in);
	        
			Staff loggedInStaff = null;
			String userStaffType = null;
	        
	        
	        //Main Menu
	        System.out.println("Are you:");
	        System.out.println("1. Patient");
	        System.out.println("2. Staff");
	        System.out.print("Enter choice: \n");
	        int userType = scanner.nextInt();

	        
	        	//Patient menu
	        if (userType == 1) {
	            System.out.println("\nPatient type:");
	            System.out.println("1. Insured");
	            System.out.println("2. PAYG");
	            System.out.print("Enter choice: \n");
	            int patientType = scanner.nextInt();

	            if (patientType == 1) {
	                System.out.println("You selected: Patient - Insured");
	            } else if (patientType == 2) {
	                System.out.println("You selected: Patient - PAYG");
	            } 
	            else {
	                System.out.println("Invalid patient option.");
	                scanner.close();
	                return; 
	            }
	            		
	            //patient actions
						System.out.println("\n");
		        		System.out.println("What would you like to do:");
		        		System.out.println("1. Create a booking");
		        		System.out.println("2. Search Booking");
		        		System.out.println("3. Cancel Booking");
		        		System.out.println("Enter choice: \n");
		        		int patientAction = scanner.nextInt();
		        		
		        		if (patientAction ==1) {
			        		System.out.println("create...");
		        		}
		        		else if (patientAction ==2) {
			        		System.out.println("search...");
		        		}		        		
		        		else if (patientAction ==3) {
			        		System.out.println("cancel...");
		        		}		        		
		        		
		        else { System.out.println("Invalid option");	}
		        	
		        

		        		
		        		
		        		
		        		
		        		
		        		
			   //Staff menu
	        } else if (userType == 2) {
	        	
	        	//Log-on or Register	     
	        	System.out.println("Would you like to \n1. Log-On or 2.Register an account");
	        	int userLogReg = scanner.nextInt();
	        	
	        				//Log-on
	        		if (userLogReg == 1) {
	        			boolean found = false;
	        			//Staff loggedInStaff = null;
	        			
	        			staffList.clear();
	        			loadStaffFromFile(staffList);
	        			
	    	        	System.out.println("Can you provide your Staff No:");
	    	        	int staffLogonNum = scanner.nextInt();
	    	        	scanner.nextLine();	    	        	
	    	        	
	    	        	System.out.println("Can you provide your Name:");
	    	        	String staffLogonName = scanner.nextLine();
	    	        	
	    	        	 for (Staff s: staffList) {
	    	        		if (s.getStaffNo()== staffLogonNum && s.getStaffName().equals(staffLogonName)) {
	    	        			loggedInStaff = s;
	    	        			found= true;
	    	        			System.out.println("Log-on successful");
	    	        			break;
	    	        			
	    	        		}
	    	        	}
	    	        	 if(!found) {
	    	        		 System.out.println("Staff not found, please register");
	    	        		 userLogReg = 2;
	    	        	 }

	    	        	 if(loggedInStaff != null) {
	 	        		switch (loggedInStaff.getStaffType()) { 
		        	    case "Nurse":
		        	        Nurse();
		        	        break;
		        	    case "Receptionist":
		        	        Nurse();
		        	        break;
		        	    case "Surgeon":
		        	        Receptionist();
		        	        break;
	 	        		}
		        	}
	    	        	 
	        	}
	        		
	        		
	        				//Register
	        		else if(userLogReg == 2) {
	        			System.out.println("what is your Staff number?");
	        			int userStaffNo = scanner.nextInt();
	        			scanner.nextLine();
	        				
	        			System.out.println("What is your name?");
	        			String userStaffName = scanner.nextLine();
	        			
	        			System.out.println("What are your contact details?");
	        			int userStaffCon = scanner.nextInt();
	        			scanner.nextLine();
	        			
	        			System.out.println("Are you a Nurse, Receptionist or Surgeon");
	        			 userStaffType = scanner.nextLine();
	        					if(!userStaffType.equals("Nurse") && !userStaffType.equals("Receptionist") && !userStaffType.equals("Surgeon")) {
	        						System.out.println("you need to choose a correct staff type");
	        					}
	        					
	        				if(userStaffNo<= 0 || userStaffName == null || userStaffName.isEmpty() ||userStaffCon<= 0 ||userStaffType == null || userStaffType.isEmpty()) 
	        				{
	        					System.out.println("All fields must be filled");
	        				}
	        				else {
	    	        	Staff newStaff = new Staff(userStaffNo, userStaffName, userStaffCon, userStaffType);
	    	        	staffList.add(newStaff);
	    	        	saveStaffToFile(newStaff);
	    	        		System.out.println("You have successfully registered");
	        			
	    	        		System.out.println("Current Staff List:");
	    	        		for (Staff s : staffList) {
	    	        		    System.out.println(s);
	    	        		}
	        				
	        				}
	        				
	    	        		if(userStaffType != null) {
	    		        		switch (userStaffType) { 
	    		        	    case "Nurse":
	    		        	        Nurse();
	    		        	        break;
	    		        	    case "Receptionist":
	    		        	        Nurse();
	    		        	        break;
	    		        	    case "Surgeon":
	    		        	        Receptionist();
	    		        	        break;
	    		        			}
	    		        		}
	        		
	        		}	        			
		        		  
		   		
	        }	else {
	            System.out.println("Invalid main menu option.");
	        }
		  
	        scanner.close();

	    	System.out.println(new File("staff.txt").getAbsolutePath());
	    	loadStaffFromFile(staffList);
	    	System.out.println(staffList);	   
	        
	    }
	    
	    	//load staff from file
    	public static void loadStaffFromFile(ArrayList<Staff> staffList) {
    	    try {
    	        File file = new File("staff.txt");
    	        Scanner fileScanner = new Scanner(file);

    	        while (fileScanner.hasNextLine()) {
    	            String line = fileScanner.nextLine();
    	            String[] parts = line.split(",");

    	            int staffNo = Integer.parseInt(parts[0]);
    	            String name = parts[1];
    	            int contact = Integer.parseInt(parts[2]);
    	            String type = parts[3];

    	            staffList.add(new Staff(staffNo, name, contact, type));
    	        }

    	        fileScanner.close();
    	    } catch (FileNotFoundException e) {
    	        System.out.println("No existing staff file found.");
    	    }
    	}
    	
    	//save staff to file
	    public static void saveStaffToFile(Staff staff) {
	        try {
	            FileWriter writer = new FileWriter("staff.txt", true); // true = append mode
	            writer.write(staff.getStaffNo() + "," +
	                         staff.getStaffName() + "," +
	                         staff.getContactDetails() + "," +
	                         staff.getStaffType() + "\n");
	            writer.close();
	        } catch (IOException e) {
	            System.out.println("Error saving staff.");
	            e.printStackTrace();
	        }
	    }
    	
	    
//	    public static void clearFile() {
//	        try {
//	            FileWriter writer = new FileWriter("staff.txt"); // overwrite
//	            writer.write(""); // write nothing
//	            writer.close();
//	            System.out.println("File cleared.");
//	        } catch (IOException e) {
//	            System.out.println("Error clearing file.");
//	        }
//	    }
	    
	    //personalised menu for staff
	    public static void Nurse() {
	    	System.out.println("View booking, View all bookings");
	    }
	    
	    public static void Receptionist() {
	    	System.out.println("day-to-day managment");
	    }

	    
	  }


