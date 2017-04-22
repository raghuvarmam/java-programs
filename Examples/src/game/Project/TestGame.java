package game.project;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Games g1= new Games();
		g1.startTheGame();
		g1.showGameDetails();
			System.out.println("Thank you have a good day Bye");
		sc.close();
				
	}

}
