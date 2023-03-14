/**
 * 
 */
package edu.westga.cs6312.Main;

import java.util.ArrayList;

import edu.westga.cs6312.Model.Contact;
import edu.westga.cs6312.Service.DataService;

/** Main class of the program
 * @author Patrick B. Mannella 
 * @version cs6312 3/13/2023
 */
public class Main {

	/** Entry point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Contact> myContacts = DataService.readContactCsv();
		int rand1 = (int) (java.lang.Math.random() * 10);
		int rand2 = (int) (java.lang.Math.random() * 10);
		int rand3 = (int) (java.lang.Math.random() * 10);
		int listLength = myContacts.size() - 1;
		
		System.out.println(myContacts.get(0).toString());
		System.out.println(myContacts.get(listLength).toString());
		System.out.println(myContacts.get(rand1).toString());
		System.out.println(myContacts.get(rand2).toString());
		System.out.println(myContacts.get(rand3).toString());
		
		
		
			
		

	}

}
