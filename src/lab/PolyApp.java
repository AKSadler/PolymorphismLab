package lab;

public class PolyApp {

	public static void main(String[] args) {
		GameCharacter[] gameCharacters = new GameCharacter[9];

		gameCharacters[0] = new Warrior("Harry", 10, 1, "knife");

		gameCharacters[1] = new Warrior("Thor", 12, 9, "club");

		gameCharacters[2] = new Wizard("Eve", 20, 12, 9, 12);

		gameCharacters[3] = new Wizard("Willow", 34, 4, 18, 1);

		gameCharacters[4] = new Wizard("Belinda", 9, 31, 9, 88);

		gameCharacters[5] = new Druid("Paul", 1, 0, 77, 54);

		gameCharacters[6] = new Troll("Bob", 10, 7);

		gameCharacters[7] = new Troll("Margo", 12, 44);

		gameCharacters[8] = new Troll("Ted", 99, 7);
		
		for (int i = 0; i < gameCharacters.length; i++) {   //ctrl space
			
			gameCharacters[i].printPlay(); 

	
		}
	}
}
