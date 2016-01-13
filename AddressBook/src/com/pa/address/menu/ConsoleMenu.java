package com.pa.address.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu {
	
	private ArrayList<ConsoleMenuItem> menuItemList = new ArrayList<ConsoleMenuItem>() ;
	
	private String name = null ;
	private String title = null ; 
	
	public ConsoleMenu(){
		this("Default Menu") ;
	}
	
	public ConsoleMenu( String name ){
		title = name ;
	}
	
	public ConsoleMenu addMenuItem(ConsoleMenuItem item ) {
		
		menuItemList.add(item) ; 
		
		return this ;
	}
	
	public void startMenu(){
		
		System.out.println(title );
		
		for ( ConsoleMenuItem item : menuItemList){
			System.out.println("" + item.getChoice() + " : " + item.getDisplayText());
		}
		
		Scanner scanner = new Scanner(System.in) ;
		int ch = scanner.nextInt() ;
		
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
