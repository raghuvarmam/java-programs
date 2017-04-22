package game.project;

import java.util.Scanner;

public class Games {
	private int score;
	private String playername;
	private int level;
	char input;
	Scanner sc = new Scanner(System.in);

	public void startTheGame(){
		System.out.println("U is for plus 1");
		System.out.println("D is for plus 2");
		System.out.println("B is for plus 10");
		System.out.println("X is for EXIT");
		System.out.println("Do you want to play the game ???");
		System.out.println("press 1 for yes 2 for no");
		int choice = sc.nextInt();
		if(choice == 1){
			playGame();
			
		}
	}
	private void playGame(){
		System.out.println("Enter player Name");
		Scanner sc = new Scanner(System.in);
		playername = sc.nextLine();
		System.out.println("start playing the game");
		do{
			input = sc.next().charAt(0); 	//syntax for char input
			switch(input){
			case 'u' :
				score=score+1;
				break;
			case 'd':
				score = score + 2;
				break;
			case 'b':
				score = score + 10;
				break;
			case 'x':
				if(score>=100 && score <200)
					level = 2;
				else if(score>=200 && score <300)
					level = 3;
				else if(score>=300 && score <400)
					level = 4;
				else if(score>=400)
					level = 5;
				else if(score<100)
					level = 1;
				break;
			}		
			
		}while(input != 'x');	
		sc.close();
	}
	
	public void showGameDetails(){
		
		System.out.println("playerName is "+playername);
		System.out.println("score is "+score);
		System.out.println("level number "+level);
		
	}

	public int getScore() {
		return score;
	}

	public int getLevel() {
		return level;
	}
	
}
