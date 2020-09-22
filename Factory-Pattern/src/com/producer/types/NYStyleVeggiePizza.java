package com.producer.types;

public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza()
	{
		name = "New York Style Veg Pizza";
		dough = "Thin Crust dough";
		sauce = "Thin layer of tomato sauce";
		
		topping.add("Tomato");
		topping.add("Mushroom");
		topping.add("Onion");
		topping.add("Olive");
	}

}
