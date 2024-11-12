package com.java.oops.compositionchallenge;

public class DishWasher {

	private boolean hasWorkToDo;
	
	
	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}


	public void doDishesh() {
		if(this.hasWorkToDo) System.out.println("washing the dishesh");
		this.hasWorkToDo=false;
	}
	

}
