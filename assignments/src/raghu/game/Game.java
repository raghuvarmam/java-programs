package raghu.game;

public class Game {

			String name;
			String type;
			int players;
			float time;

			public void showdetails(){
				System.out.println("name of the game " +name);
				System.out.println("type of game " +type);
				System.out.println("no of players " +players);
				System.out.println("total time " +time);
			}
			
			public void demogame(){
				System.out.println("demo of the game is being played");
			}

			public Game() {
				super();
			}

			public Game(String name, String type, int players, float time) {
				super();
				this.name = name;
				this.type = type;
				this.players = players;
				this.time = time;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public int getPlayers() {
				return players;
			}

			public void setPlayers(int players) {
				this.players = players;
			}

			public float getTime() {
				return time;
			}

			public void setTime(float time) {
				this.time = time;
			}
			
			
		


	}


