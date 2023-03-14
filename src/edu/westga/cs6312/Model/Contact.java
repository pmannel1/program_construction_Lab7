/**
 * 
 */
package edu.westga.cs6312.Model;

/** Contact Data 
 * @author Patrick B. Mannella
 * @version cs6312 3/13/2023
 */
public class Contact {
	
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private static String INVALID_ENTRY = "data entered is invalid";
	
	public Contact(String newFirstName, String newLastName, String newEmail, String newAddress, String newCity, String newState, String newZipcode) {
		this.setAddress(newAddress);
		this.setFirstName(newFirstName);
		this.setLastName(newLastName);
		this.setEmail(newEmail);
		this.setCity(newCity);
		this.setState(newState);
		this.setZipcode(newZipcode);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() { 
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}
	
	public void setFirstName(String otherFirstName) {
		try {
			if (otherFirstName == null || otherFirstName.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.firstName = otherFirstName;
		} catch (IllegalArgumentException e) {
			this.firstName = INVALID_ENTRY;
		}
	}
	
	public void setLastName(String otherLastName) {
		try {
			if (otherLastName == null || otherLastName.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.lastName = otherLastName;
		} catch (IllegalArgumentException e) {
			this.lastName = INVALID_ENTRY;
		}
	}
	
	public void setEmail(String otherEmail) {
		try {
			if (otherEmail == null || otherEmail.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.email = otherEmail;
		} catch (IllegalArgumentException e) {
			this.email = INVALID_ENTRY;
		}
	}
	
	public void setAddress(String otherAddress) {
		try {
			if (otherAddress == null || otherAddress.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.address = otherAddress;
		} catch (IllegalArgumentException e) {
			this.address = INVALID_ENTRY;
		}
	}
	
	public void setCity(String otherCity) {
		try {
			if (otherCity == null || otherCity.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.city = otherCity;
		} catch (IllegalArgumentException e) {
			this.city = INVALID_ENTRY;
		}
	}
	
	public void setState(String otherState) {
		try {
			if (otherState == null || otherState.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.state = otherState;
		} catch (IllegalArgumentException e) {
			this.state = INVALID_ENTRY;
		}
	}
	
	public void setZipcode(String otherZipcode) {
		try {
			if (otherZipcode == null || otherZipcode.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.zipcode = otherZipcode;
		} catch (IllegalArgumentException e) {
			this.zipcode = INVALID_ENTRY;
		}
	}
	
	@Override 
	public String toString() {
		return "First Name: " + this.getFirstName() + ", Last Name: " + this.getLastName() + ", Email: " + this.getEmail() + ", Address: " + this.getAddress() + ", City: " + this.getCity() + ", State: " + this.getState() + ", Zipcode: " + this.getZipcode();
	}

}
