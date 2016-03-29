
public class Tank {

	private int speed=70;
    private int weight = 1200;
    private Crew c;
    private Pilot p;

Tank(){
	
}

public int getSpeed(int speed) {
	this.speed = 12000/getWeight();
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getWeight() {
	weight=weight+ p.getWeight()*c.getN();
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

}

	


