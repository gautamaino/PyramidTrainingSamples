package com.pa.address.menu;

import com.pa.address.ReadAddressAction;
import com.pa.address.SaveAddressBookAction;

public class AddressBookMenu extends ConsoleMenu {
	
	public AddressBookMenu(){
		super("My Address book Menu ") ;
		
		ConsoleMenuItem addItem = new ConsoleMenuItem("Add Address" , 1 , () -> System.out.println("Action invoked - read address"));
		ConsoleMenuItem saveItem = new ConsoleMenuItem("Save Address book" , 2 , new SaveAddressBookAction());
		
		addMenuItem(addItem).addMenuItem(saveItem);
	
	}

}
 