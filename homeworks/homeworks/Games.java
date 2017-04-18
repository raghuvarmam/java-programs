package homeworks;

public class Games {

	public static void main(String[] args) {

		Game football = new Game();
		football.name="barcelona";
		football.players=11;
		football.time=90.0f;
		football.wins=79;
		
		football.running();
		football.gamedetails();
		
		System.out.println("*********************");
		
		 Game cricket =new Game();
		 cricket.name="india";
		 cricket.players=11;
		 cricket.time=180f;
		 cricket.wins=300;
		 cricket.practice();
		 cricket.gamedetails();
	}

}
class Game{
	String name;
	int players;
	float time;
	int wins;
	
	void running(){
		System.out.println("the player is running");
		
	}
	void practice(){
		System.out.println("game practicing ");
	}
	void gamedetails(){
		System.out.println("Name is "+name);
		System.out.println("no of players "+players);
		System.out.println("time taken is "+time);
		System.out.println("total wins is "+wins);
	}
}
