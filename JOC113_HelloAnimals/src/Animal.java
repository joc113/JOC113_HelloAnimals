//Parent class for all other classes
public class Animal {

	private String age;			//holds age of animal
	private String color;		//holds color of animal
	private String type;		//holds type of animal (same as object)
	private int weight;			//holds weight of animal
	private int minWeight;		//holds minimum weight an animal could be
	
	//Original Animal constructor
	public Animal (String age, String color, String type, int weight, int minWeight) {
		
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minWeight = minWeight;
	}
	
	//Constructor to be used on subclasses, since their Constructors do not contain the "type" variable, as specified by UML
	public Animal (String age, String color, int weight, int minWeight) {
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.minWeight = minWeight;
	}
	
	//Eat method adds 1 lb to animal's weight
	public void eat() {
		weight+=1;
	}
	
	//This method lowers weights by the specified amount, based on what their type is, and makes sure they don't drop below minWeight
	public void move() {
		//if the animal is a mammal and its weight is greater than its minWeight, lower weight by 1
		if (type.equals("mammal") || type.equals("fish") && weight > minWeight) {
			weight-=1;
		}
		//if the animal is a bird and its weight is 2 greater than its minWeight, lower weight by 2
		else if (type.equals("bird") && weight > minWeight+1){
			weight-=2;
		}
		//if the animal weighs so little that moving would cause it to drop below minWeight, just lower it to minWeight instead
		else {
			weight = minWeight;
		}
		
	}
	//getter for weight
	public int getWeight() {
		return weight;
	}
	
	//setter for weight
	public void setWeight(int weight) {
		weight+=this.weight;
	}
	
	//setter for type
	public void setType(String type) {
		this.type = type;
	}
	
	//This outputs final values for all variables
	public void output() {
		System.out.print("Age: " + age + " years old\nColor: " + color + "\nType: " + type + "\nWeight: " 
				+ getWeight() + " lbs\nMinimum Weight: " + minWeight + " lbs\n\n");
	}
}
