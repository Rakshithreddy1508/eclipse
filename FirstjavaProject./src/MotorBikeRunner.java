
public class MotorBikeRunner {

	public static void main(String[] args) {

      MotorBike ducati = new MotorBike();
      MotorBike honda = new MotorBike();


      ducati.start();
      honda.start();

      // Ducati
      ducati.setspeed (100);
      //ducati.increasespeed(100);
      ducati.decreasespeed(200);
      System.out.println(ducati.getspeed());

      // Honda
      honda.setspeed (30);
     // honda.increasespeed(100);
      honda.decreasespeed(130);
      System.out.println(honda.getspeed());

      //speed downs
      //ducati.setspeed (50);
      //System.out.println(ducati.getspeed());
      //honda.setspeed(0);
      //System.out.println(honda.getspeed());
	}
}
