package ch03;

public class SmallMonitor implements Monitor{
	private boolean isTurn;
	private int size;
	public SmallMonitor() {
		this.size = 50;
		this.isTurn = false;
	}
	@Override
	public boolean turnOn() {
		this.isTurn = true;
		return this.isTurn;
	}

	@Override
	public boolean turnOff() {
		this.isTurn = false;
		return isTurn;
	}
	
	@Override
	public int getSize() {
		return this.size;
	}
	
}
