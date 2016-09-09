import java.util.Scanner;

public class Car implements Vehicle{
	
	String model;
	String id;
	String passengerCapa;
	String color;
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter model of car: ");
		myCar.setModel(myScan.next());
		System.out.println("Enter id of car: ");
		myCar.setId(myScan.next());
		System.out.println("Enter passenger capacity: ");
		myCar.setPassengerCapacity(myScan.next());
		System.out.println("Enter color of car: ");
		myCar.setcolor(myScan.next());
		
		myCar.displayDetails();
	}

	@Override
	public void setModel(String model) {
		
		this.model = model;
		
	}

	@Override
	public void setPassengerCapacity(String capa) {
		this.passengerCapa =  capa;
		
	}

	@Override
	public void setId(String id) {
		this.id = id;
		
	}

	@Override
	public void setcolor(String color) {
		this.color = color;
		
	}
	
	public void displayDetails(){
		System.out.println("*********DETAILS*************");
		System.out.println("MODEL: " + this.model);
		System.out.println("ID : " + this.id);
		System.out.println("COLOR: " + this.color);
		System.out.println("CAPACITY: " + this.passengerCapa);
	}

}
