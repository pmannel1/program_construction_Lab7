package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Contact;

class ContactTest {
	private Contact myContactTest; 

	@BeforeEach
	void setUp() throws Exception {
		this.myContactTest = new Contact("Mike", "Tyson", "punch@you.com", "123 Knockout lane", "Las Vegas", "Nevada", "12345");
	}

	@AfterEach
	void tearDown() throws Exception {
		this.myContactTest = null;
	}

	@Test
	void testSetFirstName() {
		this.myContactTest.setFirstName("Tim");
		assertEquals("Tim", this.myContactTest.getFirstName(), "this.myContactTest.setFirstName() test failed");
	}
	
	@Test
	void testSetFirstNameNull() {
		this.myContactTest.setFirstName(null);
		assertEquals("data entered is invalid", this.myContactTest.getFirstName(), "this.myContactTest.setFirstName(null) test failed");
	}
	
	@Test
	void testSetFirstNameBlank() {
		this.myContactTest.setFirstName("");
		assertEquals("data entered is invalid", this.myContactTest.getFirstName(), "this.myContactTest.setFirstName(blank) test failed");
	}
	
	@Test
	void testSetLastName() {
		this.myContactTest.setLastName("Tim");
		assertEquals("Tim", this.myContactTest.getLastName(), "this.myContactTest.setLastName() test failed");
	}
	
	@Test
	void testSetLastNameNull() {
		this.myContactTest.setLastName(null);
		assertEquals("data entered is invalid", this.myContactTest.getLastName(), "this.myContactTest.setLastName(null) test failed");
	}
	
	@Test
	void testSetLastNameBlank() {
		this.myContactTest.setLastName("");
		assertEquals("data entered is invalid", this.myContactTest.getLastName(), "this.myContactTest.setLastName(blank) test failed");
	}
	
	@Test
	void testSetEmail() {
		this.myContactTest.setEmail("Tim");
		assertEquals("Tim", this.myContactTest.getEmail(), "this.myContactTest.setEmail() test failed");
	}
	
	@Test
	void testSetEmailNull() {
		this.myContactTest.setEmail(null);
		assertEquals("data entered is invalid", this.myContactTest.getEmail(), "this.myContactTest.setEmail(null) test failed");
	}
	
	@Test
	void testSetEmailBlank() {
		this.myContactTest.setEmail("");
		assertEquals("data entered is invalid", this.myContactTest.getEmail(), "this.myContactTest.setEmail(blank) test failed");
	}
	
	@Test
	void testSetAddress() {
		this.myContactTest.setAddress("Tim");
		assertEquals("Tim", this.myContactTest.getAddress(), "this.myContactTest.setAddress() test failed");
	}
	
	@Test
	void testSetAddressNull() {
		this.myContactTest.setAddress(null);
		assertEquals("data entered is invalid", this.myContactTest.getAddress(), "this.myContactTest.setAddress(null) test failed");
	}
	
	@Test
	void testSetAddressBlank() {
		this.myContactTest.setAddress("");
		assertEquals("data entered is invalid", this.myContactTest.getAddress(), "this.myContactTest.setAddress(blank) test failed");
	}
	
	@Test
	void testSetCity() {
		this.myContactTest.setCity("Tim");
		assertEquals("Tim", this.myContactTest.getCity(), "this.myContactTest.setCity() test failed");
	}
	
	@Test
	void testSetCityNull() {
		this.myContactTest.setCity(null);
		assertEquals("data entered is invalid", this.myContactTest.getCity(), "this.myContactTest.setCity(null) test failed");
	}
	
	@Test
	void testSetCityBlank() {
		this.myContactTest.setCity("");
		assertEquals("data entered is invalid", this.myContactTest.getCity(), "this.myContactTest.setCity(blank) test failed");
	}
	
	@Test
	void testSetState() {
		this.myContactTest.setState("Tim");
		assertEquals("Tim", this.myContactTest.getState(), "this.myContactTest.setState() test failed");
	}
	
	@Test
	void testSetStateNull() {
		this.myContactTest.setState(null);
		assertEquals("data entered is invalid", this.myContactTest.getState(), "this.myContactTest.setState(null) test failed");
	}
	
	@Test
	void testSetStateBlank() {
		this.myContactTest.setState("");
		assertEquals("data entered is invalid", this.myContactTest.getState(), "this.myContactTest.setState(blank) test failed");
	}
	
	@Test
	void testSetZipcode() {
		this.myContactTest.setZipcode("Tim");
		assertEquals("Tim", this.myContactTest.getZipcode(), "this.myContactTest.setZipcode() test failed");
	}
	
	@Test
	void testSetZipcodeNull() {
		this.myContactTest.setZipcode(null);
		assertEquals("data entered is invalid", this.myContactTest.getZipcode(), "this.myContactTest.setZipcode(null) test failed");
	}
	
	@Test
	void testSetZipcodeBlank() {
		this.myContactTest.setZipcode("");
		assertEquals("data entered is invalid", this.myContactTest.getZipcode(), "this.myContactTest.setZipcode(blank) test failed");
	}

}
