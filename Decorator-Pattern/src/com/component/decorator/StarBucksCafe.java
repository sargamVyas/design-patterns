package com.component.decorator;

import com.sargam.component.*;

public class StarBucksCafe {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		  System.out.println(beverage.getDescription()
		    + " $" + beverage.cost());
		 
		        // Make a DarkRoast object
		  Beverage beverage2 = new DarkRoast();
		        // Wrap it with a Mocha.
		  beverage2 = new Mocha(beverage2);
		        // Wrap it in a second Mocha
		  beverage2 = new Mocha(beverage2);
		        // Wrap it in a Milk
		  beverage2 = new Milk(beverage2);
		  System.out.println(beverage2.getDescription() 
		    + " $" + beverage2.cost());
		 
		  Beverage beverage3 = new HouseBlend();
		  beverage3 = new Milk(beverage3);
		  beverage3 = new Mocha(beverage3);
		  System.out.println(beverage3.getDescription()
		    + " $" + beverage3.cost());
		 }

}
