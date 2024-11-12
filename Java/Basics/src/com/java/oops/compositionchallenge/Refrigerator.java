package com.java.oops.compositionchallenge;

public class Refrigerator {

	private boolean hasWorkToDo;
	
	 public void orderFood(){
		 if(this.hasWorkToDo) System.out.println("ordering the food");
		 this.hasWorkToDo=false;
	}
	public void setHasWorkToDo(boolean hasWorkToDo) {
			this.hasWorkToDo=hasWorkToDo;
	}

}
