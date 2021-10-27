
public class Snake {
	private final int infloor = 5;
	private final int tofloor = 1;
	private final int increase = -2;
	
	public int getInfloor() {
		return infloor;
	}
	
	public void getSnake(Player player) {
		System.out.println("Player position Floor-" + infloor);
		System.out.println(player.getName() + " has reached a Snake FLoor");
		player.printPlayerPos(player.getPos());
		player.setTotal(player.getTotal() + increase);
		System.out.println("Total points " + player.getTotal());
		player.setPos(tofloor);
	}
}
