package com.java.oops.compositionchallenge;

public class CoffeeMaker {

	private boolean hasWorkToDo;
	
	public  void brewCofee() {
		if(this.hasWorkToDo) System.out.println("preparing the cofee");
		this.hasWorkToDo=false;
	}
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo=hasWorkToDo;
	}

}
