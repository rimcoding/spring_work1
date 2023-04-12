package ch04;

public class MainTest {

	public static void main(String[] args) {
		Monitor m1 = new MediumMonitor();
		Monitor m2 = new SmallMonitor();
		
		MonitorFactory mf = new MonitorFactory(m2);
		
		System.out.println(mf.CheckMonitor());
		System.out.println(m2.getSize());
		
	}

}
