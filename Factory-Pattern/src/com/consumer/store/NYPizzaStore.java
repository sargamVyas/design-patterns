package com.consumer.store;

import com.producer.types.NYStyleCheesePizza;
import com.producer.types.NYStyleVeggiePizza;
import com.producer.types.Pizza;

public class NYPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String type)
	{
		if(type == "Cheese")
			return new NYStyleCheesePizza();
		else if(type == "Veggie")
			return new NYStyleVeggiePizza();
		else
			return null;
	}

}
