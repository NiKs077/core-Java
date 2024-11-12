package com.java.oops.compositionchallenge;

public class SmartKitchen {
	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;
	
	SmartKitchen(){
		this.brewMaster= new CoffeeMaker();
		this.dishWasher=new DishWasher();
		this.iceBox=new Refrigerator();
	}

//	 private void addWater(){
//		brewMaster.setHasWorkToDo(true);
//	}
//	private void pourMilk(){
//		iceBox.setHasWorkToDo(true);
//	}
//	private void loadDishWasher(){
//		dishWasher.setHasWorkToDo(true);
//	}
	public void setKitchenState(boolean hasWorkToDoForCofee, boolean hasWorkToDishWah, boolean hasWorkToDoForRefrigerator){
		brewMaster.setHasWorkToDo(hasWorkToDoForCofee);
		dishWasher.setHasWorkToDo(hasWorkToDishWah);
		iceBox.setHasWorkToDo(hasWorkToDoForRefrigerator);
		
	}
//	private void getCofeeMaker(CoffeeMaker maker){
//		maker.brewCofee();
//	}
//	private void getDishWaher(DishWasher washer){
//		 washer.doDishesh();
//	}
//	private void getRefrigerator(Refrigerator ref){
//		ref.orderFood();
//	}
	public void doKitchenWork(){
		brewMaster.brewCofee();
		iceBox.orderFood();
		dishWasher.doDishesh();
	}
}
