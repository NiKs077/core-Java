package com.java.oops.compositionchallenge;

public class TestSmartKitchen {

	public static void main(String[] args) {
//		CoffeeMaker coffeeMaker= new CoffeeMaker();
//		DishWasher dishWasher=new DishWasher();
//		Refrigerator refrigerator = new Refrigerator();
		
		SmartKitchen smartKitchen=new SmartKitchen();
//		smartKitche.addWater();
		smartKitchen.setKitchenState(true, true, true);
		smartKitchen.doKitchenWork();
		
		
	}
}
