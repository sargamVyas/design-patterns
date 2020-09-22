package com.consumer.store;

import com.producer.types.*;


public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String type)
	{
		if(type == "Cheese")
			return new ChicagoStyleCheesePizza();
		else if(type == "Veggie")
			return new ChicagoStyleVeggiePizza();
		else
			return null;
	}

}
