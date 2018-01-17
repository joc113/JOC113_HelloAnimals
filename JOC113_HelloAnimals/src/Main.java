import java.util.ArrayList;
public class Main {

	public static void main (String[] args) {
		
		//Create a bunch of animals with various starting values
		Mammal deer = new Mammal("4", "tan", 150, 90);
		Fish salmon = new Fish("2", "salmon", 19, 9);
		Fish tuna = new Fish("3", "blue", 15, 6);
		Bird blueJay = new Bird("1", "blue", 3, 1);
		Bird robin = new Bird("1", "red", 3, 2);
		Mammal raccoon = new Mammal("3", "black and gray", 30, 20);
		
		//comment
		//The deer is eating and gaining weight
		deer.eat();
		
		//The tuna swims around
		tuna.swim();
		
		//The robin is flying around, which shows that it can fly without dropping below minWeight
		robin.fly();
		
		//Here is a series of eating and moving to display method functionality
		
		blueJay.eat();
		raccoon.run();
		salmon.eat();
		blueJay.fly();
				
		//Create an ArrayList to store all of these animals
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(deer);
		animals.add(salmon);
		animals.add(tuna);
		animals.add(blueJay);
		animals.add(robin);
		animals.add(raccoon);
		
		
		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).output();
	    }
	}
}