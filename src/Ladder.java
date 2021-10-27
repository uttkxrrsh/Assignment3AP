
public class Ladder {
	private final int infloor = 8;
	private final int tofloor = 12;
	private final int increase = 2;
	
	public int getInfloor() {
		return infloor;
	}
	
	public void getLadder(Player player) {
		System.out.println("Player position Floor-" + infloor);
		System.out.println(player.getName() + " has reached a Ladder FLoor");
		player.printPlayerPos(player.getPos());
		player.setTotal(player.getTotal() + increase);
		System.out.println("Total points " + player.getTotal());
		player.setPos(tofloor);
	}
}
