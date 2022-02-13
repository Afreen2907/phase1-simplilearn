package test;

import demo.Foo;

public class Bar extends Foo {
	
	private int sum = 100;
	
	public void reportSum ()
	{
		sum += result; //able to access from foo class which is in different package but bar is subclass of foo 
		//so we can access it from foo
		
		//sum += num; // num wont be visible as it is in default
	}
}
