package lab;

public class GameCharacter {

	private String name;
	private int intelligence;
	private int strength;

	public GameCharacter(String name, int intelligence, int strength) {
		super();
		setName(name);
		setIntelligence(intelligence);
		setStrength(strength);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void printPlay() {
		System.out.println(name + ": " + "intelligence: " + intelligence + ", strength: " + strength);

	}

}
