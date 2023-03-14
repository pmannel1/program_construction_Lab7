/**
 * 
 */
package edu.westga.cs6312.Service;

import edu.westga.cs6312.Model.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** Data Service 
 * @author Patrick B. Mannella
 * @version cs6312 3/13/2023
 */
public class DataService {
	
	private static final int CONTACTPROPLENGTH = 7;
	private static final String CONTACTDATAFILE = "contact_data.csv";
	
	private void ContactDataService() {};
	
	public static ArrayList<Contact> readContactCsv() {
		try {
			ArrayList<Contact> myReturnArray = new ArrayList<Contact>();
			String currentLine;
			BufferedReader myReader = new BufferedReader(new FileReader(CONTACTDATAFILE));	
			while ((currentLine = myReader.readLine()) != null && !currentLine.isBlank()) {
				String[] lineProps = currentLine.split(",");
				
				if (lineProps.length != CONTACTPROPLENGTH) { 
					continue;
				}
				
				String fName = lineProps[0];
				String lName = lineProps[1];
				String email = lineProps[2];
				String address = lineProps[3];
				String city = lineProps[4];
				String state = lineProps[5];
				String zipcode = lineProps[6];
				
				myReturnArray.add(new Contact(fName, lName, email, address, city, state, zipcode));
			}
			myReader.close();
			return myReturnArray;
			
		} catch (FileNotFoundException notFoundException) {
			return new ArrayList<Contact>();
		} catch (IOException ioException) {
			return new ArrayList<Contact>();
		}
		
	}
	
	public static void writeContactDetails(ArrayList<Contact> contactReaderList) {
		java.io.File file = new java.io.File("PatrickMannellaLab07/contact_output.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		try {
			java.io.PrintWriter output = new java.io.PrintWriter(file);
			
			for (Contact currentContact : contactReaderList) {
				output.println(currentContact.getFirstName());
				output.print(currentContact.getLastName());
				output.print(currentContact.getEmail());
				output.print(currentContact.getAddress());
				output.print(currentContact.getCity());
				output.print(currentContact.getState());
				output.print(currentContact.getZipcode());
				
				output.close();
			}
		} catch (FileNotFoundException e) {
			return;
		}
		
		
	}

}
