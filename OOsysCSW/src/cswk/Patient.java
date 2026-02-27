package cswk;

import java.time.LocalDate;

public class Patient {
	private int patientRef;
	private String patientName;
	private int nhsNum;
	private LocalDate regDate;
	
	public Patient(int patientRef,String patientName,int nhsNum,LocalDate regDate) {
		this.patientRef= patientRef;
		this.patientName= patientName;
		this.nhsNum= nhsNum;
		this.regDate= regDate;
		}
	
	//Getters
	public int getPatientRef() {
		return patientRef;
	}

	
	public void makeBooking() {
	}
	
	public void cancelBooking() {
	}
	
	public void searchBooking() {
	}
	

}
