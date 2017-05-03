package poly.overiding.libarrary;

public class Robo {
	private double speed;
	private int memory;
	private String name;
	
	
	public Robo() {
		super();
	}
	public Robo(double speed, int memory, String name) {
		super();
		this.speed = speed;
		this.memory = memory;
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String display = "Robo name= "+name+", memory = "+memory+", speed = "+speed;
		return display;
	}
	
	public boolean equals(Object obj) {

		if(obj instanceof Robo){

			Robo robo = (Robo)obj;		
			if((this.getMemory()==(robo.memory)) & (this.getSpeed() == (robo.speed)) & (this.name.equals(robo.name)))
				return true;				
		}
		return false;
	}
	
	

}
