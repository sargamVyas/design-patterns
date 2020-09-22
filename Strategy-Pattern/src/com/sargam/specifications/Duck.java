package com.sargam.specifications;

import com.sargam.behavior.FlyBehavior;
import com.sargam.behavior.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	void performFly()
	{
		flyBehavior.fly();
	}
	
	void performQuack()
	{
		quackBehavior.quack();
	}

	public abstract void display();
	
}
