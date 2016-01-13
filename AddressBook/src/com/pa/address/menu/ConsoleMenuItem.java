package com.pa.address.menu;

public class ConsoleMenuItem {
	
	private int choiceId = -1 ;
	private String menuDisplayString ; 
	private Action menuItemAction ; 
	
	public ConsoleMenuItem(String display , int ch , Action act ){
		choiceId = ch ;
		menuDisplayString = display ;
		menuItemAction = act ;
	}

	public String getDisplayText() {
		return menuDisplayString;
	}

	public int getChoice() {
		return choiceId;
	}

	public void executeAction() throws ConsoleMenuException {
		if ( menuItemAction != null){
			menuItemAction.executeAction() ;
		}else throw new ConsoleMenuException("Action null not configured") ; 
		
	}
	
	
	
}
