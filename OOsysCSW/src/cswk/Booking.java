package cswk;

import java.time.LocalDate;

public class Booking {
	private int uuid;
	private int staffRef;
	private int patientRef;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Booking(int uuid, int staffRef, int patientRef, LocalDate startDate, LocalDate endDate) {
		this.uuid = uuid;
		this.staffRef = staffRef;
		this.patientRef = patientRef;
		this.startDate = startDate;
		this.endDate = endDate;
		

	    // ToDo : Get & Set Methods ?

	}

	public int getUuid() {
		return uuid;
	}
}
