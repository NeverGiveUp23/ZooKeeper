

public class Mammel {
//	private member variables/ attributes
	private String name;
	private int anger;
	private boolean hungry;
	private int energy;
	
	
	
	
// constructors
	public Mammel(String name, int anger, boolean hungry) {
		this.name = name;
		this.anger = anger;
		this.hungry = hungry;
		this.energy = 100;
	}
	
	
	public Mammel(String name) {
		this.name = name;
		this.anger = 10;
		this.hungry = true;
		this.energy = 100;
	}
	
	
	public void display() {
		System.out.println(" ------ " + this.name + " ------ ");
		System.out.println("Anger Level: " + this.anger);
		System.out.println("Hungry: " + this.hungry);
		System.out.println("Health: " + this.energy);
	}
	
	public Mammel lowerEnergy(int attack, String attackType) {
		System.out.println(this.name + " is attacking with " + attackType);
		energy -= attack;
		System.out.println("Ouch, that took off " + attack + " Health.");
		System.out.println("Health: " + this.energy);
		return this;
	}


//	getters and setters

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAnger() {
		return anger;
	}




	public void setAnger(int anger) {
		this.anger = anger;
	}




	public boolean isHungry() {
		return hungry;
	}




	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}




	public int getEnergy() {
		return energy;
	}




	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
	

	

	


}
