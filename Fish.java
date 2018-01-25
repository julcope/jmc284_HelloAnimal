package jmc284_HelloAnimals;

public class Fish extends Animal {

	public Fish(String age, String color, int weight, int minimumWeight) {
		super(age, color, "Fish", weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	
	public void swim()
	{
		//fish lose 1 weight to swim
		this.setWeight(getWeight() - 1 );
		
	}

}
