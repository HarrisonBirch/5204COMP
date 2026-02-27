package cswk;

import java.time.LocalTime;
import java.util.ArrayList;

public class Surgery {
	private String name;
	private String postCode;
	private LocalTime openingTime;
	private LocalTime closingTime;
	
    private ArrayList<Patient> patients;
   // private ArrayList<Staff> staff;
    private ArrayList<Booking> bookings;

    public Surgery() {
        patients = new ArrayList<>();
        bookings = new ArrayList<>();
    }
	
	//public Surgery(String name,String postCode,LocalTime openingTime,LocalTime closingTime) {
		//this.name= name;
		//this.postCode= postCode;
		//this.openingTime= openingTime;
		//this.closingTime= closingTime;	}
	
	public void makeBookingStaff() {

	}
	
	public void makeBookingPatient() {

	}
	public void cancelBooking() {
		//ask for uuid and find uuid, 
		//then give customer opportunity to remove object in array

	}
	public void searchBooking() {
		//somehow make a way to create future booking slots in an array, 
		//this could be the purpose of booking class

	}
	public void Register() {
		//the staff can search up booking that are already booked or new booking, and can assign themselves
		//nurse definitely and surgeon might have to be consulting
		//receptionist can do the same but with patients has to be new
	}
	public void Searching() {
		//staff can search their own bookings, receptionist can search patients bookings
	}
	public void checkAvailability() {
		//method to see what bookings are available
	}
}
