package jmc284_HelloAnimals;

public class Mammal extends Animal {

	public Mammal(String age, String color,  int weight, int minimumWeight) {
		super(age, color, "Mammal", weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	
	public void run()
	{
		this.setWeight(getWeight() - 1);
		
	}
}
