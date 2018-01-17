//Child of Animal
public class Bird extends Animal{

	////Contructor that sets the Animal object = to the specified values when declaring
	public Bird(String age, String color, int weight, int minWeight) {
		super(age, color, weight, minWeight);
		super.setType("bird");
	}
	//move method for birds, which decreases weight by 2, unless they dropped below minWeight
	public void fly() {
		
		//calls move from the superclass, which contains the necessary logic
		super.move();
	}
}
