
public final class Elevator extends Ladder {
	private final int infloor = 2;
	private final int tofloor = 10;
	private final int increase = 4;
	
	@Override
	public int getInfloor() {
		return infloor;
	}
	
	@Override
	public void getLadder(Player player) {
		System.out.println("Player position Floor-" + infloor);
		System.out.println(player.getName() + " has reached an Elevetor FLoor");
		player.setTotal(player.getTotal() + increase);
		System.out.println("Total points " + player.getTotal());
		player.setPos(tofloor);
	}
}
