import java.util.Scanner;

public class UserInterface {
	
	public void displayMenu(){
	System.out.println("---Menu---");
	System.out.println("Choose an option:");
	System.out.println("1. Add Node");
	System.out.println("2. Search for Node at Index");
	System.out.println("3. Delete Node at Index");
	System.out.println("4. Print List");
	System.out.println("5. Exit");
	}
	
	public void displayAddElementText(){
		System.out.println("Enter the number you would like to add: ");
	}
	
	public void displaygetElementText(){
		System.out.println("Enter the index of the element you would like to search for. (0 is the first element): ");
	}
	
	public void displaydeleteElementText(){
		System.out.println("Enter the index of the element you would like to delete. (0 is the first element): ");
	}
	
	public void displayPrintListtText(){
		System.out.println("Would you like to print from the head or tail? (Head, Tail)");
	}
}
