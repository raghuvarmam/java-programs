package game.Project;

import java.util.Scanner;

public class Games {
    String name="car";
	private int score;
	private String playername;
	private int level;
	char input;

	public void playgame(){
		System.out.println("gameName is "+name);
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
				break;
			}
		}while(input != 'x');
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
		sc.close();
		
	}
	public void showGameDetails(){
		System.out.println("gameName is "+name);
		System.out.println("playerName is "+playername);
		System.out.println("score is "+score);
		System.out.println("level number "+level);
		
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

}
