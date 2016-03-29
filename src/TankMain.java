
public class TankMain {

	public static void main(String[] args) {
		Tank t = new Tank();
		Crew c = new Crew();
		Pilot p = new Pilot(80);
		
		t.setC(c);
		System.out.println();

	}

}
