package before;

public class Car {
	   private Tire tire;
	   
	   
	   public Tire getTire() {
	      return tire;
	   }


	   public void setTire(Tire tire) {
	      this.tire = tire;
	   }


	   public void drive() {
	      tire.roll();
	   }
	}