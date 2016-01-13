package com.pa.address;

import java.util.ArrayList;

public class AddressBookMain {

	private static ArrayList<Address> myAddressList = new ArrayList<Address>();

	public static void main(String[] args) {
		ConsoleAddressManager manager = new ConsoleAddressManager();
		manager.run();
	}	

}
