package jmc284_HelloAnimals;

import java.util.ArrayList;

public class HelloAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal1 = new Animal("22", "blue", "mammal", 22, 18);
		//animal1.output();
	
		Bird bird1 = new Bird("22", "purple", 22, 18);
		Fish fish1 = new Fish("2", "blue", 5, 5);
		Mammal mammal1 = new Mammal("65", "pink", 100, 70);
		
		Bird bird2 = new Bird("20", "red", 20, 17);
		Fish fish2 = new Fish("55", "pink", 60, 7);
		Mammal mammal2 = new Mammal("105", "blue", 150, 120);
		
		ArrayList<Animal> listOfAnimals = new ArrayList<Animal>();
		listOfAnimals.add(bird1);
		listOfAnimals.add(bird2);
		listOfAnimals.add(fish1);
		listOfAnimals.add(fish2);
		listOfAnimals.add(mammal1);
		listOfAnimals.add(mammal2);
		
		for(int i = 0; i < 6; i++)
		{
			listOfAnimals.get(i).eat();
		}
				
		bird1.fly();
		bird2.fly();
		
		fish1.swim();
		fish2.swim();

		mammal1.run();
		mammal2.run();

		for(int i = 0; i < 6; i++)
		{
			listOfAnimals.get(i).output();
		}
		
	
		
		
		
	}
	
	
}
