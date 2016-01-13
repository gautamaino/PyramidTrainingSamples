package com.pa.address;

import com.pa.address.menu.Action;

public class ReadAddressAction implements Action {

	@Override
	public boolean executeAction() {
		
		System.out.println("Action invoked - read address");
		
		return false;
	}

}
