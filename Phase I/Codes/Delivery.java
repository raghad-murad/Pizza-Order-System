// NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

//class Delivery which extends PizzaOrder (superClass:PizzaOrder, subClass:Delivery)
public class Delivery extends PizzaOrder{
	
	//attributes
	private double tripRate;
	
	private int zone;

	/**Constructors with no arguments */
	public Delivery() {
		super();
	}

	/**Constructors with specified properties */ 
	public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double tripRate, int zone) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.tripRate = tripRate;
		this.zone = zone;
	}

	//setter and getter methods
	public double getTripRate() {
		return tripRate;
	}

	public void setTripRate(double tripRate) {
		this.tripRate = tripRate;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	} 
	
	@Override // returns a string representation of the object
	public String toString() {
		String res = "Trip Rate = " + (int)tripRate + "\nZone = " + zone;
		return super.toString() + "\n" + res;			
	}
	
	@Override /**Method that calculates the price of the pizza order according to the equation price+((tripRate/100)*price*zone)*/
	public double calculateOrderPrice() {
		double orderPrice = super.calculateOrderPrice() + ((tripRate/100)*super.calculateOrderPrice()*zone);
		return orderPrice;
	}
	
	
	
}
