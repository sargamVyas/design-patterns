package com.consumer.store;

public class SubsidisedPizzaPlace {
	
	public static void main(String[] args)
	{
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("Cheese");
		
		PizzaStore chStore = new ChicagoPizzaStore();
		chStore.orderPizza("Veggie");

		
	}

}
