import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


//NAME&ID Raghad Murad Buzia 1212214
//lecture section 5 & lab section 9

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
	/**Create an initial interface that contains a welcome label and a button to order now.
	 *  When you click on it, it will take you to the order interface*/
	Label welcome = new Label("Welcome"); //create a welcome label 
	welcome.setLayoutX(33);
	welcome.setLayoutY(20);
	
	Button orderNow = new Button("Order now!"); //create a order button
	orderNow.setLayoutX(20);
	orderNow.setLayoutY(50);
	
	Group root1 = new Group(); //create a group
	
	root1.getChildren().addAll(orderNow,welcome); //add the button and the label to the group root1
	
	Scene scene1 = new Scene(root1,120,120,Color.ORANGE); //add the group root1 to the scene1 and give it dimensions 100 by 100 and the color orange
	
	Stage stage2 = new Stage(); //create a new stage
	
	orderNow.addEventHandler(ActionEvent.ACTION, (e)-> {
		stage2.setResizable(false);
		stage2.show();
	});
	
	
	//Create what will appear in the order interface(Customer name, order Type, list of Topping, topping price and order price)
	Label customerName1 = new Label("-Customer Name:"); //create a label
	customerName1.setLayoutX(5);
	customerName1.setLayoutY(10);
	TextField customerName2 = new TextField(); //create a TextField
	customerName2.setLayoutX(105);
	customerName2.setLayoutY(10);
	
	Label orderType1 = new Label("-Order Type:"); //create a label 
	orderType1.setLayoutX(5);
	orderType1.setLayoutY(50);
	ComboBox orderType2 = new ComboBox(); //create t ComboBox
	orderType2.getItems().addAll("To go","Delivery","Seated"); 
	orderType2.getSelectionModel().select(0); //set the first type(ToGO) sas the deafult value
	orderType2.setLayoutX(105);
	orderType2.setLayoutY(50);
	
	Label tripRate1 = new Label("-Trip Rate:");
	tripRate1.setLayoutX(5);
	tripRate1.setLayoutY(260);
	tripRate1.setVisible(false);
	TextField tripRate2 = new TextField();
	tripRate2.setLayoutX(115);
	tripRate2.setLayoutY(260);
	tripRate2.setVisible(false);
	
	Label zone1 = new Label("-Zone:");
	zone1.setLayoutX(5);
	zone1.setLayoutY(300);
	zone1.setVisible(false);
	TextField zone2 = new TextField();
	zone2.setLayoutX(115);
	zone2.setLayoutY(300);
	zone2.setVisible(false);
	
	Label serviceCharge1 = new Label("-Service Charge:");
	serviceCharge1.setLayoutX(5);
	serviceCharge1.setLayoutY(260);
	serviceCharge1.setVisible(false);
	TextField serviceCharge2 = new TextField();
	serviceCharge2.setLayoutX(115);
	serviceCharge2.setLayoutY(260);
	serviceCharge2.setVisible(false);
	
	Label numberOfPeople1 = new Label("-Number of People:");
	numberOfPeople1.setLayoutX(5);
	numberOfPeople1.setLayoutY(300);
	numberOfPeople1.setVisible(false);
	TextField numberOfPeople2 = new TextField();
	numberOfPeople2.setLayoutX(115);
	numberOfPeople2.setLayoutY(300);
	numberOfPeople2.setVisible(false);
	
	/** Show specific fields (serviceCharge,numberOfPeople) if the user choosing  a Seated as a type 
	 * and hide it and Show another specific fields (tripRate,zone) if the user choosing a Delivery as a type 
	 * and hide all fields if the type is ToGo*/
	orderType2.addEventHandler(ActionEvent.ACTION, (e)-> {
		if(orderType2.getSelectionModel().isSelected(0)) {
			tripRate1.setVisible(false);
			tripRate2.setVisible(false);
			zone1.setVisible(false);
			zone2.setVisible(false);
			serviceCharge1.setVisible(false);
			serviceCharge2.setVisible(false);
			numberOfPeople1.setVisible(false);
			numberOfPeople2.setVisible(false);
		}
		else if(orderType2.getSelectionModel().isSelected(2)) {
			tripRate1.setVisible(false);
			tripRate2.setVisible(false);
			zone1.setVisible(false);
			zone2.setVisible(false);
			serviceCharge1.setVisible(true);
			serviceCharge2.setVisible(true);
			numberOfPeople1.setVisible(true);
			numberOfPeople2.setVisible(true);
			
		}
		else if(orderType2.getSelectionModel().isSelected(1)) {
			tripRate1.setVisible(true);
			tripRate2.setVisible(true);
			zone1.setVisible(true);
			zone2.setVisible(true);
			serviceCharge1.setVisible(false);
			serviceCharge2.setVisible(false);
			numberOfPeople1.setVisible(false);
			numberOfPeople2.setVisible(false);
		}
	});
	
	Label pizzaSize = new Label("-Pizza Size:");
	pizzaSize.setLayoutX(5);
	pizzaSize.setLayoutY(90);
	RadioButton small = new RadioButton("1");
	small.setSelected(true);
	small.setLayoutX(105);
	small.setLayoutY(90);
	RadioButton medium = new RadioButton("2");
	medium.setLayoutX(155);
	medium.setLayoutY(90);
	RadioButton large = new RadioButton("3");
	large.setLayoutX(205);
	large.setLayoutY(90);
	ToggleGroup Size = new ToggleGroup();
	small.setToggleGroup(Size);
	medium.setToggleGroup(Size);
	large.setToggleGroup(Size);
	
	Label listOfToppings = new Label("-List of Toppings:");
	listOfToppings.setLayoutX(5);
	listOfToppings.setLayoutY(120);
	CheckBox onions = new CheckBox("Onions");
	onions.setLayoutX(105);
	onions.setLayoutY(120);
	CheckBox olives = new CheckBox("Olives");
	olives.setLayoutX(175);
	olives.setLayoutY(120);
	CheckBox greenPeppers = new CheckBox("Green Peppers");
	greenPeppers.setLayoutX(240);
	greenPeppers.setLayoutY(120);
	
	Label toppingPrice1 = new Label("-Topping Price:");
	toppingPrice1.setLayoutX(5);
	toppingPrice1.setLayoutY(150);
	TextField toppingPrice2 = new TextField();
	toppingPrice2.setLayoutX(105);
	toppingPrice2.setLayoutY(150);
	toppingPrice2.setText("10");
	
	Label orderPrice1 = new Label("-Order Price:");
	orderPrice1.setLayoutX(5);
	orderPrice1.setLayoutY(190);
	TextField orderPrice2 = new TextField();
	orderPrice2.setLayoutX(105);
	orderPrice2.setLayoutY(190);
	orderPrice2.setText("0.0");
	
	//It saves the user data in the ArrayList orders and then calculate the  order price and shows it on the GUI
	Button processOrder = new Button("Process Order");
	processOrder.setLayoutX(5);
	processOrder.setLayoutY(230);
	
	//It arranges the data of all users in ascending order and displays the user names and the order price in a new GUI
	Button printOrders = new Button("Print Orders");
	printOrders.setLayoutX(105);
	printOrders.setLayoutY(230);
	
	//It restarts the program as it was at the beginning
	Button reset = new Button("Reset");
	reset.setLayoutX(205);
	reset.setLayoutY(230);
	
	//creates an ArrayList called orders of type PizzaOrder
	ArrayList<PizzaOrder>orders = new ArrayList<>();
	//adds five different orders to the ArrayList orders two Delivery, one ToGO, two Seated
	orders.add(new Delivery("Ahmad",PizzaOrder.LARGE,3,10,10,3));
	orders.add(new Delivery("Suha",PizzaOrder.MEDIUM,2,5,20,2));
	orders.add(new ToGo("Ribhi", PizzaOrder.MEDIUM,4,5));
	orders.add(new Seated("Rana", PizzaOrder.SMALL,3,1,2,3));
	orders.add(new Seated("Jamal", PizzaOrder.LARGE,4,2,4,5));
	
	/**create an appropriate object based on the pizza order type selected ( ToGo, Delivery, or Seated) by using the data provided by the user in the order GUI.
	 * Then add the created pizza order object to an ArrayList of type PizzaOrder called orders. 
	 * after that we use the created object to calculate the orderPrice and display it to the GUI.*/
	processOrder.setOnAction( new EventHandler<ActionEvent> () {
		@Override
		public void handle(ActionEvent event) {
		
		if(orderType2.getSelectionModel().isSelected(0)) {
			int size = 0;
			if(small.isSelected())
				size = 1;
			else if(medium.isSelected())
				size = 2;
			else if(large.isSelected())
				size = 3;
				
			int numberOfTopping = 0;
			if(onions.isSelected() && olives.isSelected() && greenPeppers.isSelected())
				numberOfTopping = 3;
			else if((onions.isSelected()&&olives.isSelected()) || (onions.isSelected()&&greenPeppers.isSelected()) || (olives.isSelected()&&greenPeppers.isSelected()))
				numberOfTopping = 2;
			else if(onions.isSelected() || olives.isSelected() || greenPeppers.isSelected())
				numberOfTopping = 1;
			ToGo order = new ToGo(customerName2.getText(),size,numberOfTopping,Double.parseDouble(toppingPrice2.getText()));
			orders.add(order);
			orderPrice2.setText(order.calculateOrderPrice() + "");
		}
		else if(orderType2.getSelectionModel().isSelected(1)) {
			int size = 0;
			if(small.isSelected())
				size = 1;
			else if(medium.isSelected())
				size = 2;
			else if(large.isSelected())
				size = 3;
				
			int numberOfTopping = 0;
			if(onions.isSelected() && olives.isSelected() && greenPeppers.isSelected())
				numberOfTopping = 3;
			else if((onions.isSelected()&&olives.isSelected()) || (onions.isSelected()&&greenPeppers.isSelected()) || (olives.isSelected()&&greenPeppers.isSelected()))
				numberOfTopping = 2;
			else if(onions.isSelected() || olives.isSelected() || greenPeppers.isSelected())
				numberOfTopping = 1;
			
			Delivery order = new Delivery(customerName2.getText(),size,numberOfTopping,Double.parseDouble(toppingPrice2.getText()),
					Double.parseDouble(tripRate2.getText()),Integer.parseInt(zone2.getText()));
			orders.add(order);
			orderPrice2.setText(order.calculateOrderPrice() + "");
		}
		else if(orderType2.getSelectionModel().isSelected(2)) {
			int size = 0;
			if(small.isSelected())
				size = 1;
			else if(medium.isSelected())
				size = 2;
			else if(large.isSelected())
				size = 3;
				
			int numberOfTopping = 0;
			if(onions.isSelected() && olives.isSelected() && greenPeppers.isSelected())
				numberOfTopping = 3;
			else if((onions.isSelected()&&olives.isSelected()) || (onions.isSelected()&&greenPeppers.isSelected()) || (olives.isSelected()&&greenPeppers.isSelected()))
				numberOfTopping = 2;
			else if(onions.isSelected() || olives.isSelected() || greenPeppers.isSelected())
				numberOfTopping = 1;
			
			Seated order = new Seated(customerName2.getText(),size,numberOfTopping,Double.parseDouble(toppingPrice2.getText()),
					Double.parseDouble(serviceCharge2.getText()),Integer.parseInt(numberOfPeople2.getText()));
			orders.add(order);
			orderPrice2.setText(order.calculateOrderPrice() + "");
		}
	}
	});
	
	//create a new Stage (Print Info Stage)
	Stage stage3 = new Stage();
	
	Group root3 = new Group();
	
	/** First we sort the data then print a list of customer names and order prices for orders saved in ArrayList orders on another stage (Print Info GUI) */
	printOrders.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			Collections.sort(orders);
			int y = 10;
			for(PizzaOrder value : orders){
				Label name1 = new Label("Customer Name:");
				name1.setLayoutX(5);
				name1.setLayoutY(y);
				Label name2 = new Label(value.getCustomerName());
				name2.setLayoutX(105);
				name2.setLayoutY(y);
				Label order1 = new Label("Order Price:");
				order1.setLayoutX(170);
				order1.setLayoutY(y);
				Label order2 = new Label(value.calculateOrderPrice()+"");
				order2.setLayoutX(270);
				order2.setLayoutY(y);
				root3.getChildren().addAll(name1,name2,order1,order2);
				y += 30;
			}
			stage3.show();
		}
		});
	
	/**reset ALL items and fields to their default values */
	reset.setOnAction( new EventHandler<ActionEvent> () {
		@Override
		public void handle(ActionEvent event) {
			customerName2.setText("");
			orderType2.getSelectionModel().select(0);
			small.setSelected(true);
			toppingPrice2.setText("10");
			orderPrice2.setText("0.0");
			tripRate2.setText("");
			zone2.setText("");
			serviceCharge2.setText("");
			numberOfPeople2.setText("");
			onions.setSelected(false);
			olives.setSelected(false);
			greenPeppers.setSelected(false);
			
		}
	});
	
	//create a new scene and add root3 to it In addition to determining its dimensions and color
	Scene scene3 = new Scene(root3,350,300,Color.ORANGE);
	stage3.setTitle("Print Orders"); //set title to the stage3
	stage3.setScene(scene3);//add the scene3 to the primary stage
	
	Group root2 = new Group();
	root2.getChildren().addAll(customerName1,customerName2,orderType1,orderType2,pizzaSize,small,medium,large,listOfToppings,
			onions,olives,greenPeppers,toppingPrice1,toppingPrice2,orderPrice1,orderPrice2,processOrder,printOrders,reset
			,serviceCharge1,serviceCharge2,numberOfPeople1,numberOfPeople2,tripRate1,tripRate2,zone1,zone2);
	Scene scene2 = new Scene(root2,500, 350,Color.ORANGE);
	stage2.setTitle("Order Stage");//set title to the stage
	stage2.setScene(scene2);//add the scene2 to the primary stage2
	
	primaryStage.setTitle("Welcome Interface");//set title to the primaryStage
	primaryStage.setScene(scene1); //add the scene1 to the primary stage
	primaryStage.setResizable(false); //set resizable false "can not change the size"
	primaryStage.show(); //display the primaryStage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}