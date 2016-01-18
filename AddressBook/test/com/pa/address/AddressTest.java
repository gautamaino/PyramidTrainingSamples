package com.pa.address;

import static org.junit.Assert.*;

import org.junit.Test;


public class AddressTest {

	@Test
	public void testGetId() {
		Address addr = new Address() ;
		assertTrue(addr.getId() == -1) ;
		addr.setId(1);
		assertTrue(addr.getId() == 1) ;
	}

	@Test
	public void testGetAdress() {
		Address addr = new Address() ; 
		final String testAddr = "Ben yehuda 54, tel aviv" ; 
		addr.setAdress(testAddr);
		assertTrue(addr.getAdress().equals(testAddr)) ;
		assertFalse(addr.getId() != -1);
	}

	@Test
	public void testToString() {
		
	}

}
