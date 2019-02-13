package virtual_pets_amok;

public class Cat {

	private String name;
	private int hunger;

	public Cat(String name, int hunger, int thirst, int boredom) {
		this.name = name;
		this.hunger = hunger;
	}

	public String getName() {
	
		return name;
	}

	public int getHunger() {

		return hunger;
	}

}
