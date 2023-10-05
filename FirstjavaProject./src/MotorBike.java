
public class MotorBike {        //class
	private int speed; //member variable

	void setspeed(int speed) {
		if(speed>0) {
			this.speed=speed;
		}
	}
	 public int getspeed() {
		 return this.speed;
	 }

	 public void increasespeed(int howmuch) {
		 this.speed = this.speed+howmuch;
	 }
	 public void decreasespeed(int howmuch) {
		 this.speed = this.speed-howmuch;
	 }

	void start() {
		System.out.println("Bike started");
	}
}
