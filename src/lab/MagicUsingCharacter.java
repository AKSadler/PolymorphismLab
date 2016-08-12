package lab;

public class MagicUsingCharacter extends GameCharacter {

	private int magicalEnergy;

	public int getMagicalEnergy() {
		return magicalEnergy;
	}

	public void setMagicalEnergy(int magicalEnergy) {
		this.magicalEnergy = magicalEnergy;
	}

	public MagicUsingCharacter(String name, int intelligence, int strength, int magicalEnergy) {
		super(name, intelligence, strength);
		setMagicalEnergy(magicalEnergy);
	}

	@Override

	public void printPlay() {
		System.out.println(getName() + ": intelligence: " + getIntelligence() + ", strength: " + getStrength()
				+ ", magical energy: " + magicalEnergy);

	}
}
