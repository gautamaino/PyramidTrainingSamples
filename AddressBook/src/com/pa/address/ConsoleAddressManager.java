package com.pa.address;

import java.io.Console;
import java.io.InputStream;

public class ConsoleAddressManager {

	public Address getAddressFromConsole(){
		
		Address a = new Address() ;
		
		Console console = System.console() ;
		
		System.out.println("enter street" );
		a.setStreet(console.readLine()) ;
		
		System.out.println("enter address");
		a.setAdress(console.readLine()) ;
		
		return a ;
		
	}
	
	public void displayAddress(Address a){
		System.console().writer().write(a.getStreet());
		System.console().writer().write(a.getAdress());
	}
}
