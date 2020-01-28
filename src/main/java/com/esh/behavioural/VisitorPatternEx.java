package com.esh.behavioural;

interface Item {
	int accept(ShopppingCartVisitor visitor);
}

class Book implements Item {
	@Override
	public int accept(ShopppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

class Maggie implements Item {
	@Override
	public int accept(ShopppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

interface ShopppingCartVisitor {
	int visit(Book book);

	int visit(Maggie maggie);
}

class ShoppingCartVisitorImpl implements ShopppingCartVisitor {

	@Override
	public int visit(Book book) {
		return 1;
	}

	@Override
	public int visit(Maggie maggie) {
		return 2;
	}

}

public class VisitorPatternEx {
	public static void main(String[] args) {
		Item[] items = new Item[]{new Book(), new Maggie()};
		ShopppingCartVisitor cart = new ShoppingCartVisitorImpl();
		int totalAmt =0;
		for(Item item : items){
			totalAmt+= item.accept(cart) ;
;		}
		System.out.println("Total amt: " + totalAmt);
	}
}
