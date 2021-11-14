package com.xworkz.mobile;

public class MobileDTO {
	private String brand;
	private int price;
	private String color;
	private int ram;

	public MobileDTO(String brand, int price, String color, int ram) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
}
