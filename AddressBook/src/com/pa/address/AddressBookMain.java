package com.pa.address;

import java.util.ArrayList;

public class AddressBookMain {

	private static ArrayList<Address> myAddressList = new ArrayList<Address>();

	public static void main(String[] args) {
		ConsoleAddressManager addressReader = new ConsoleAddressManager();
		
		// TODO Auto-generated method stub
		for (int indx = 0; indx < 3; indx++) {
			
			Address fromConsole = addressReader.getAddressFromConsole();
			myAddressList.add(fromConsole);
		}
		
		for (Address a : myAddressList){
			addressReader.displayAddress(a);
		}
		
		System.console().flush();
	
	}

}
