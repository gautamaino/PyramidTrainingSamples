package com.pa.address.menu;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu {
	
	private ArrayList<ConsoleMenuItem> menuItemList = new ArrayList<ConsoleMenuItem>() ;
	
	private String name = null ;
	private String title = null ;

	private PrintStream outStream;

	private Scanner inScanner; 
	
	public ConsoleMenu(){
		this("Default Menu") ;
	}
	
	public ConsoleMenu( String name ){
		title = name ;
	}
	
	public ConsoleMenu(String name , PrintStream stream , Scanner scanner){
		outStream = stream ;
		inScanner = scanner ; 
	}
	
	public ConsoleMenu addMenuItem(ConsoleMenuItem item ) {
		
		menuItemList.add(item) ; 
		
		return this ;
	}
	
	public void startMenu(){
		
		outStream.println(title );
		
		for ( ConsoleMenuItem item : menuItemList){
			System.out.println("" + item.getChoice() + " : " + item.getDisplayText());
		}
		
		int ch = inScanner.nextInt() ;
		
		for( ConsoleMenuItem item : this.menuItemList){
			if ( item.getChoice() == ch){
				try {
					item.executeAction() ;
				} catch (ConsoleMenuException e) {
					System.out.println("Seems you have forgotten to configure an action for your menu item " );
					e.printStackTrace();
				}
			}
		}
		
	}

}
