package com.xworkz.mobile;

public class MobileDAO {
	public MobileDAO() {
		System.out.println("inside MobileDAO");
	}

	public void displayMobileDTO(MobileDTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getPrice());
		System.out.println(dto.getColor());
		System.out.println(dto.getRam());

	}

	public void displayMobileDAO(MobileDTO dtoArray[]) {
		for (int i = 0; i < dtoArray.length; i++) {
			System.out.println(dtoArray[i].getBrand());
			System.out.println(dtoArray[i].getPrice());
			System.out.println(dtoArray[i].getColor());
			System.out.println(dtoArray[i].getRam());
		}

	}

	public MobileDTO createMobile(String brand, int price, String color, int ram) {
		System.out.println("inside create method");
		MobileDTO mobile = new MobileDTO(brand, price, color, ram);
		return mobile;
	}

}
