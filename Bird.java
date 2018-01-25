package jmc284_HelloAnimals;

public class Bird extends Animal {
	
	
	
	public Bird(String age, String color, int weight, int minimumWeight) {
		
		super(age, color, "Bird", weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		this.setWeight(getWeight() - 2);
	}

}
