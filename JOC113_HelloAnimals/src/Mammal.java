
public class Mammal extends Animal{

	public Mammal(String age, String color, int weight, int minWeight) {
		super(age, color, weight, minWeight);
		super.setType("mammal");
	}
	
	//move method for mammals, which decreases weight by 1, unless they dropped below minWeight
	public void run() {
		
		//calls move from the superclass, which contains the necessary logic
		super.move();
	}
}

