package com.saop.SpringAop.services;

import org.springframework.stereotype.Component;

public class PaymentServiceImpl1{

	public Boolean makePayment(String code) {
		
		Boolean status = true;

		// payment code....
		
		System.out.println("Amount debited....." + code);
		////////
		
		System.out.println("Amount credited....." + code);
		
		userdetails();
		return status;
	}
	
	public static void userdetails() {
		String name = "Ajay";
		System.out.println("Name : " + name.length());
	}

}
