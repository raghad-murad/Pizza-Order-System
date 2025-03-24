//NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

//class ToGo which extends PizzaOrder (superClass:PizzaOrder, subClass:ToGo)
public class ToGo extends PizzaOrder{

	/**Constructors with no arguments */
	public ToGo() {
		super();
	}
	
	/**Constructors with specified properties */ 
	public ToGo(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
	}
	
}
