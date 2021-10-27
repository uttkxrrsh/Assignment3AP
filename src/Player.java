
public final class Player {
	private final String name;
	private int pos;
	private int total = 0;
	
	public Player(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void printPlayerPos(int pos) {
		String[] arr = {"START","Empty","Elevator","Empty","Empty","Snake","Empty","Empty","Ladder","Empty","Empty","King Cobra","Empty","FINISH",};
		for(int i = 0; i<14; i++) {
			if(i != pos) {
				System.out.println(arr[i] + " Floor ");
			}
			else {
				System.out.println(arr[i] + " Floor "+ "***" + name + " is on this floor" + "***");
			}
		}
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
