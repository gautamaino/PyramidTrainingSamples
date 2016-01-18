package com.pa.address.menu;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsoleMenuTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testAddMenuItem() {
		fail("Not yet implemented");
	}
	
	 class MockAction implements Action{

		@Override
		public void executeAction() {
			
			assertTrue("My Mock action executed" , true);
			
		}
		 
	 }
	 
	 class CustomMockStream extends InputStream{

		@Override
		public int read() throws IOException {
			return 1 ;
		}
	 }

	@Test
	public void testStartMenu() {
		
		ConsoleMenu menu = new ConsoleMenu("My Menu Title" , System.out , new Scanner(new CustomMockStream())) ;
		
		ConsoleMenuItem item = new ConsoleMenuItem("Menu Item to display" , 2 , new MockAction()) ;
		
		menu.addMenuItem(item);
		
		menu.startMenu(); 
		
	}

}
