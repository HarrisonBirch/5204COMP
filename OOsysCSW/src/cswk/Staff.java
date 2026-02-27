package cswk;


public class Staff {
	private int staffNo;
	private String staffName;
	private int contactDetails;
	private String staffType;

	public Staff(int staffNo,String staffName,int contactDetails, String staffType) {
		this.staffNo= staffNo;
		this.staffName= staffName;
		this.contactDetails= contactDetails;
		this.staffType= staffType;
		}
	
	public Staff() {
		
	}
	
	
	@Override
	public String toString() {
	    return "Staff No: " + staffNo +
	           ", Name: " + staffName +
	           ", Contact: " + contactDetails +
	           ", Type: " + staffType;
	}
	
	
	
	public int getStaffNo() {
		return staffNo;
	}
	
	public void setStaffNo(int newStaffNo) {
		this.staffNo = newStaffNo;
	}
	
	

	public String getStaffName() {
		return staffName;
	}
	
	public String getStaffType() {
		return staffType;
	}


	public int getContactDetails() {
		return contactDetails;
	}


}
