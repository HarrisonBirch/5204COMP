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


	}
	public void searchBooking() {


	}

	public void Searching() {

	}
	public void checkAvailability() {

	}
}

