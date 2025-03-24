import java.util.*;
import java.lang.*;

//NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

public class Driver {

	public static void main(String[] args) {
		
		/**-	creates an ArrayList called orders of type PizzaOrder*/
		ArrayList<PizzaOrder>orders = new ArrayList<>();
		
		/**we adds five different orders to the ArrayList orders two Delivery, one ToGO, two Seated*/
		orders.add(new Delivery("Ahmad",PizzaOrder.LARGE,3,10,10,3));
		orders.add(new Delivery("Suha",PizzaOrder.MEDIUM,2,5,20,2));
		orders.add(new ToGo("Ribhi", PizzaOrder.MEDIUM,4,5));
		orders.add(new Seated("Rana", PizzaOrder.SMALL,3,1,2,3));
		orders.add(new Seated("Jamal", PizzaOrder.LARGE,4,2,4,5));
		
		//Sorts the orders based on their calculated order price
		/**invoke a method sortOrders which take an ArrayList of type PizzaOrder and sort it according to Order Price*/
		sortOrders (orders);
		
		//Prints the sorted orders customer names and prices
		for(PizzaOrder value : orders) {
			value.printOrderInfo();
		}
		
		//Prints the total sum of all order prices
		//invoke a method calculateTotalOrdersPrice 
		System.out.println("\nTotal sum of Order Prices = " + calculateTotalOrdersPrice(orders));
		
		//Prints a report ( all properties and  order price ) for the second Delivery order ( orders.get(1) 
		System.out.println("\n" + orders.get(1).toString() + "\nOrder Price = " + (int)orders.get(1).calculateOrderPrice());

	}
	
	/**create a method calculateTotalOrdersPrice which take an ArrayList of type PizzaOrder and return the total pizza order price*/
	public static double calculateTotalOrdersPrice(ArrayList<PizzaOrder>orders) {
		double totalPrice=0;
		for(PizzaOrder value : orders){
			totalPrice += value.calculateOrderPrice();
		}
		return totalPrice;
	}
	
	/**create a method sortOrders which take an ArrayList of type PizzaOrder and sort it according to Order Price by using java.util.Collections.sort */
	public static void sortOrders (ArrayList<PizzaOrder>orders) {
		Collections.sort(orders);
	}
}
