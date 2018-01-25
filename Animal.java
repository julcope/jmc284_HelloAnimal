package jmc284_HelloAnimals;
// Julia Cope
//1.24.18
//Java II assignment 1

public class Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	public Animal(String age, String color, String type, int weight, int minimumWeight) {
		//Constructor takes in all the info and creates an animal object. assign all attributes
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
		
	}
	
	public void eat() {
		//every animal gets +1 weight for eating
		this.weight += 1;
	}
	
	public int getWeight() {
		//return weight
		return weight;
		
	}
	
	public void setWeight(int newWeight) {
		//make sure the new weight is not less than the minimum!
		if (newWeight >= this.minimumWeight)
			this.weight = newWeight;
		else
			System.out.println("This animal can't move!");
	}
	
	public void output()
	{
		//print info about the animal
		System.out.println("Type: " + type);
		System.out.println("age: " + age);
		System.out.println("color: " + color);
		System.out.println("weight: " + weight);
		
	}
}
