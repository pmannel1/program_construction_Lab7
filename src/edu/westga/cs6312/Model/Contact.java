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
		try {
			this.setAddress(newAddress);
			this.setFirstName(newFirstName);
			this.setLasttName(newLastName);
			this.setEmail(newEmail);
			this.setCity(newCity);
			this.setState(newState);
			this.setZipcode(newZipcode);
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
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
			if (otherFirstName.equals(null) || otherFirstName.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.firstName = otherFirstName;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setLasttName(String otherLastName) {
		try {
			if (otherLastName.equals(null) || otherLastName.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.lastName = otherLastName;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setEmail(String otherEmail) {
		try {
			if (otherEmail.equals(null) || otherEmail.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.email = otherEmail;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setAddress(String otherAddress) {
		try {
			if (otherAddress.equals(null) || otherAddress.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.address = otherAddress;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setCity(String otherCity) {
		try {
			if (otherCity.equals(null) || otherCity.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.city = otherCity;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setState(String otherState) {
		try {
			if (otherState.equals(null) || otherState.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.state = otherState;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	public void setZipcode(String otherZipcode) {
		try {
			if (otherZipcode.equals(null) || otherZipcode.equals("")) {
				throw new IllegalArgumentException(INVALID_ENTRY);
			}
			this.zipcode = otherZipcode;
		} catch (IllegalArgumentException e) {
			System.out.println(INVALID_ENTRY);
		}
	}
	
	@Override 
	public String toString() {
		return "First Name: " + this.getFirstName() + ", Last Name: " + this.getLastName() + ", Email: " + this.getEmail() + ", Address: " + this.getAddress() + ", City: " + this.getCity() + ", State: " + this.getState() + ", Zipcode: " + this.getZipcode();
	}

}
