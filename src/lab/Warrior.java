package lab;

public class Warrior extends GameCharacter {

	private String weaponType;

	public Warrior(String name, int intelligence, int strength, String weaponType) {
		super(name, intelligence, strength);
		setWeaponType(weaponType);
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	@Override

	public void printPlay() {
		System.out.println(getName() + ": intelligence: " + getIntelligence() + ", strength: " + getStrength()
				+ ", weapon type: " + weaponType);

	}

}
