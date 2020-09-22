package com.sargam.specifications;

public class DuckSelection {

	public static void main(String[] args) {
		
		Duck duck = new MalardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		
		Duck toyDuck = new ToyDuck();
		toyDuck.performFly();
		toyDuck.performQuack();
		toyDuck.display();
	}

}
