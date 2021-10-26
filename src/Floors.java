
public class Floors {
	private Player _player;
	private Ladder  ladder = new Ladder();
	private Elevator elevator = new Elevator();
	private Snake snake = new Snake();
	private KingCobra cobra = new KingCobra();
	private int[] empty = {0,1,3,4,6,7,9,10,12,13};
	
	Floors(Player player){
		this._player = player;
	}
	public void toemptyFloor() {
		System.out.println("Player position Floor-" + _player.getPos());
		System.out.println(_player.getName() + " has reached an Empty FLoor");
		_player.setTotal(_player.getTotal() + 1);
		System.out.println("Total points " + _player.getTotal());
	}
	
	public void toLadder() {
		ladder.getLadder(_player);
		toemptyFloor();
	}
	public void toElevator() {
		elevator.getLadder(_player);
		toemptyFloor();
	}
	public void toSnake() {
		snake.getSnake(_player);
		toemptyFloor();
	}
	public void toCobra() {
		cobra.getSnake(_player);
		toemptyFloor();
	}
	
	public boolean isEmptyFloor() {
		for(int i = 0; i< empty.length; i++) {
			if(_player.getPos() == empty[i]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isLadder() {
		if(_player.getPos() == ladder.getInfloor()) {
			return true;
		}
		return false;
	}
	
	public boolean isElevator() {
		if(_player.getPos()== elevator.getInfloor()) {
			return true;
		}
		return false;
	}
	public boolean isSnake() {
		if(_player.getPos() == snake.getInfloor()) {
			return true;
		}
		return false;
	}
	public boolean isCobra() {
		if(_player.getPos()== cobra.getInfloor()) {
			return true;
		}
		return false;
	}
}
