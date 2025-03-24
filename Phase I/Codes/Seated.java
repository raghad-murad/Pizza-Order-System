//NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

//class Seated which extends PizzaOrder (superClass:PizzaOrder, subClass:Seated)
public class Seated extends PizzaOrder{
	
	//attributes
	private double serviceCharge;
	
    private int numberOfPeople;
    
    /**Constructors with no arguments */
    public Seated() {
		super();
	}

    /**Constructors with specified properties */ 
	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double serviceCharge, int numberOfPeople) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;
	}

	//setter and getter methods
	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	@Override // returns a string representation of the object
	public String toString() {
		String res = "Service Charge = " + (int)serviceCharge + "\nNumber Of People = " + numberOfPeople;
		return super.toString() + "\n" + res;			
	}
	
    @Override /**Method that calculates the price of the pizza order according to the equation price+(serviceCharge*numberOfPeople)*/
	public double calculateOrderPrice() {
		double orderPrice = super.calculateOrderPrice() + (serviceCharge*numberOfPeople);
		return orderPrice;
	}
}
