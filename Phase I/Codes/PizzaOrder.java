import java.util.*;

//NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

//class PizzaOrder which implements the Comparable interface
public class PizzaOrder implements Comparable<PizzaOrder>{

	//attributes 
	final static int SMALL=1;
	
	final static int MEDIUM=2;
	
	final static int LARGE=3;
	
	private String customerName; 
	
	private Date dateOrdered;
	
	private int pizzaSize;
	
	private int numberOfToppings;
	
	private double toppingPrice;

	/**Constructors with no arguments */ 
	public PizzaOrder() {
		this.dateOrdered = new Date();
	}
	
	/**Constructors with specified properties */ 
	public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		this.customerName = customerName;
		this.dateOrdered = new Date();
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
	}

	//setter and getter methods
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(int pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	@Override // returns a string representation of the object
	public String toString() {
		String pizzaOrder = "Customer Name = " + customerName + "\nDate Ordered = " + dateOrdered + "\nPizza Size = ";
		if(pizzaSize == 1)
			pizzaOrder = pizzaOrder + "small";
		else if(pizzaSize == 2)
			pizzaOrder = pizzaOrder + "medium";
		else if(pizzaSize == 3)
			pizzaOrder = pizzaOrder + "large";
		
		pizzaOrder = pizzaOrder + "\nNumber of Toppings = " + numberOfToppings + "\nTopping Price = " + (int)toppingPrice;
		return pizzaOrder;			
	}
	
	/**Method that calculates the price of the pizza order according to the equation (numberOfToppings*toppingPrice)*pizzaSize*/
	public double calculateOrderPrice() {
		double orderPrice = (numberOfToppings*toppingPrice)*pizzaSize;
		return orderPrice;
	}
	
	/**Method that prints only the customer’s name and the calculated order price on one line to the screen*/
	public void printOrderInfo () {
		System.out.println(customerName + "   " + (int)calculateOrderPrice());
	}
	
	public void print(Object obj) {
		System.out.println(obj);
	}
	
	@Override //Implement the compareTO method defined in comparable that compare two pizza orders according to their order prices 
	public int compareTo(PizzaOrder newPizzaOrder) {
		if(calculateOrderPrice() > newPizzaOrder.calculateOrderPrice())
			return 1;
		else if(calculateOrderPrice() < newPizzaOrder.calculateOrderPrice())
			return -1;
		else 
			return 0;
	}
}

