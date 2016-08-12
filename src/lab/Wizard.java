package lab;

public class Wizard extends MagicUsingCharacter {

	private int spellNumber;

	public int getSpellNumber() {
		return spellNumber;
	}

	public void setSpellNumber(int spellNumber) {
		this.spellNumber = spellNumber;
	}

	public Wizard(String name, int intelligence, int strength, int magicalEnergy, int spellNumber) {
		super(name, intelligence, strength, magicalEnergy);
		setSpellNumber(spellNumber);
	}

	@Override

	public void printPlay() {
		System.out.println(getName() + ": intelligence: " + getIntelligence() + ", strength:" + getStrength()
				+ ", magical energy: " + getMagicalEnergy() + ", spell number: " + spellNumber);

	}
}
