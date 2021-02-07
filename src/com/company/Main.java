package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle prymushka=new Rectangle(4,6);
	Rectangle kvadorik=new Rectangle(7);
	Rectangle bratPrymushki=new Rectangle(4,6);


	prymushka.printArea();
	kvadorik.printArea();
	bratPrymushki.printArea();


	prymushka.printRectangleKind();
	kvadorik.printRectangleKind();
	bratPrymushki.printRectangleKind();


	prymushka.isTheSameRectangle(kvadorik);
	kvadorik.isTheSameRectangle(bratPrymushki);
	prymushka.isTheSameRectangle(bratPrymushki);
    prymushka.printCreatedRectangles();
    prymushka.printClassName(true);

    }
}
