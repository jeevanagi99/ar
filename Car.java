package com.Association;

public class Car {
	String brand;
	String price;
	String color;
	Engine engine=new Engine(1234,"Petrol",3000);
	public void travel() {
		engine.start();
		System.out.println("travlling");
		engine.stop();
	}

}
