package com.pa.address.menu;

import java.util.ArrayList;

public class ConsoleMenu {
	
	private ArrayList<ConsoleMenuItem> menuItemList = new ArrayList<ConsoleMenuItem>() ;
	
	private String name = null ;
	
	public ConsoleMenu(){
		this("Default Menu") ;
	}
	
	public ConsoleMenu( String name ){
		
	}
	
	public void addMenuItem(ConsoleMenuItem item ) {
		
		menuItemList.add(item) ; 
	}
	
	public void executeMenu(){
		
	}

}
