import java.util.*;

public class SnakeLadder {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void diceRoller(Dice dice) {
		System.out.println("Hit enter to roll the dice");
		sc.nextLine();
		dice.roll();
		System.out.println("Dice gave " + dice.getFaceValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Enter the player name and hit enter");
		name = sc.nextLine();
		Dice dice = new Dice(2);
		Player player = new Player(name, -1);
		Floors floors = new Floors(player);
		System.out.println("The game setup is ready");
		diceRoller(dice);
		while(dice.getFaceValue() != 1) {
			System.out.println("Game cannot start until you get 1");
			diceRoller(dice);
		}
		while(player.getPos() != 13){
			player.setPos(player.getPos() + dice.getFaceValue());
			if(floors.isEmptyFloor()) {
				floors.toemptyFloor();
				if(player.getPos() == 12) {
					break;
				}
			}
			if(floors.isCobra()) {
				floors.toCobra();
			}
			if(floors.isElevator()) {
				floors.toElevator();
			}
			if(floors.isLadder()) {
				floors.toLadder();
			}
			if(floors.isSnake()) {
				floors.toSnake();
			}
			diceRoller(dice);
		}
		if(player.getPos() == 12) {
			while(dice.getFaceValue() != 1) {
				System.out.println("Hit enter to roll the dice");
				sc.nextLine();
				System.out.println("Dice gave 2\nPlayer cannot move");
			}
			System.out.println("Dice gave 1");
			player.setPos(13);
			floors.toemptyFloor();
		}
		if(player.getPos()==13) {
			System.out.println("Game Over\n"+ player.getName()+ " accumulated " + player.getTotal() + "points");
		}
	}

}
