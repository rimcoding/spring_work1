package ch03;

public class MediumMonitor implements Monitor{
	private boolean isTurn;
	private int size;
	public MediumMonitor() {
		this.size = 100;
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
