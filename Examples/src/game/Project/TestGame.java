package game.Project;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		System.out.println("U is for plus 1");
		System.out.println("D is for plus 2");
		System.out.println("B is for plus 10");
		System.out.println("X is for EXIT");
		System.out.println("Do you want to play the game ???");
		System.out.println("press 1 for yes 2 for no");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			Games g1 =new Games();
			g1.playgame();
			g1.showGameDetails();
		}
		else
			System.out.println("Thank you have a good day Bye");
		sc.close();

	}

}
