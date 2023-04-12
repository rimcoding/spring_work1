package ch04;

public class MonitorFactory {
	
	private Monitor monitor;
	public MonitorFactory(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public int CheckMonitor() {
		return this.monitor.getSize();
	}
}
