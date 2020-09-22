package com.consumer.store;

import com.producer.types.Pizza;

public abstract class PizzaStore {
	
	Pizza pizza;
	
	public void orderPizza(String type)
	{
		pizza = createPizza(type);
		pizza.prepare();
		pizza.cut();
	}
	
	public abstract Pizza createPizza(String type);

}
