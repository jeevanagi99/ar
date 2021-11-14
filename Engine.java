package com.Association;

public class Engine {
	int imei;
	String type;
	int cc;

	public Engine(int imei, String type, int cc) {
		System.out.println("inside Engine");
		this.imei = imei;
		this.type = type;
		this.cc = cc;
	}

	public void start() {
		System.out.println("engine started");
	}

	public void stop() {
		System.out.println("engine stoped");
	}

}
