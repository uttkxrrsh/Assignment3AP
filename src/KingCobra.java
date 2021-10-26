
public final class KingCobra extends Snake {
	private final int infloor = 11;
	private final int tofloor = 3;
	private final int increase = -4;
	
	@Override
	public int getInfloor() {
		return infloor;
	}
	
	@Override
	public void getSnake(Player player) {
		System.out.println("Player position Floor-" + infloor);
		System.out.println(player.getName() + " has reached a King Cobra FLoor");
		player.setTotal(player.getTotal() + increase);
		System.out.println("Total points " + player.getTotal());
		player.setPos(tofloor);
	}
}
