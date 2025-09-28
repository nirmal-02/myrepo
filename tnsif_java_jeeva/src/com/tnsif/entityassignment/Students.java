package com.tnsif.entityassignment;

public class Students {
	// Fields
	int id;
	String name;
	double score;

	public static void main(String[] args) {

		Students c1 = new Students();
		c1.id = 101;
		c1.name = "Rishi";
		c1.score = 6.75;
		System.out.println("Id: " + c1.id + " Name: " + c1.name + " Score: " + c1.score);

		Students c2 = new Students();
		c2.id = 102;
		c2.name = "Veeravel";
		c2.score = 6.85;
		System.out.println("Id: " + c2.id + " Name: " + c2.name + " Score: " + c2.score);

		Students c3 = new Students();
		c3.id = 103;
		c3.name = "Thanushram";
		c3.score = 7.45;
		System.out.println("Id: " + c3.id + " Name: " + c3.name + " Score: " + c3.score);
	}
}
