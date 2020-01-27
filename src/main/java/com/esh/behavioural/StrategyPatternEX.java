package com.esh.behavioural;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface PaymentStrategy {
	void pay();
}

class CreditCardStrategy implements PaymentStrategy {
	private int cardNo;
	private int cvv;

	CreditCardStrategy(int cardNo, int cvv) {
		this.cardNo = cardNo;
		this.cvv = cvv;
	}

	@Override
	public void pay() {
		System.out.println("Paying using credit card with cardNo: " + cardNo + " CVV: " + cvv);
	}
}

class InternetBankingStrategy implements PaymentStrategy {
	private String custID;
	private String pwd;

	public InternetBankingStrategy(String custId, String pwd) {
		this.custID = custId;
		this.pwd = pwd;
	}

	@Override
	public void pay() {
		System.out.println("Paying using Internet Banking with Customer ID: " + custID + " PWD: " + pwd);
	}

}

class ShoppingCart {
	private PaymentStrategy paymentStrategy;
	List<String> items;

	ShoppingCart(PaymentStrategy paymentStrategy, List<String> items) {
		this.paymentStrategy = paymentStrategy;
		this.items = items;
	}

	public void pay() {
		paymentStrategy.pay();
	}
}

public class StrategyPatternEX {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("a");
		
		PaymentStrategy creditCardStrategy = new CreditCardStrategy(1234, 456);
		ShoppingCart cart1 = new ShoppingCart(creditCardStrategy, items);
		cart1.pay();
		
		PaymentStrategy internetBankingStrategy = new InternetBankingStrategy("123", "234");
		ShoppingCart cart2 = new ShoppingCart(internetBankingStrategy, items);
		cart2.pay();
	}
}
