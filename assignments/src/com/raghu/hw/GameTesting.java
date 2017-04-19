package com.raghu.hw;
import raghu.game.*;   		//imported the class from different package of same java project
public class GameTesting {

	public static void main(String[] args) {

		Game g1 = new Game();
		g1.setName("nfs");
		System.out.println(g1.getName());
		g1.showdetails();
		
		Game g2 = new Game("mario","adventure",1,5.00f);
		g2.showdetails();
		g2.demogame();
		g2.setType("race");
		System.out.println(g2.getType());
		
	}

}
