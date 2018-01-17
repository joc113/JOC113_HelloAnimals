//Child of Animal
public class Fish extends Animal{

	//Contructor that sets the Animal object = to the specified values when declaring
	public Fish(String age, String color, int weight, int minWeight) {
		super(age, color, weight, minWeight);
		super.setType("fish");
	}
	
	//This method is the move method for fish, which decreases weight by 1, unless they went below minWeight
	public void swim() {
		
		//calls move from the superclass, which contains the necessary logic
		super.move();
		
	}
	
}
