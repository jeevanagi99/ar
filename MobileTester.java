package com.xworkz.mobile;

public class MobileTester {

	public static void main(String[] args) {

		MobileDAO mobileDAO = new MobileDAO();
		MobileDTO sony = mobileDAO.createMobile("sony", 10000, "red", 4);
		MobileDTO mi = mobileDAO.createMobile("mi", 10000, "red", 4);
		MobileDTO iphone = mobileDAO.createMobile("Iphone", 10000, "red", 4);
		MobileDTO mobileArray[] = { sony, mi, iphone };
		mobileDAO.displayMobileDTO(sony);
		
		mobileDAO.displayMobileDAO(mobileArray);
		System.out.println("----------------");
	}

}
