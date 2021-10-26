
public final class Player {
	private final String name;
	private int pos;
	private int total = 0;
	
	public Player(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getPos() {
		return pos;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}
}
