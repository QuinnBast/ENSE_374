import java.util.Scanner;

public class LinkedListProgram {
	
	static Scanner in = new Scanner(System.in);
	
	private static LinkedList LList = new LinkedList();
	private static UserInterface UI = new UserInterface();
	
	public static void main(String args[])
	{
		int userchoice = 1;
		while (userchoice != 5)
		{
		UI.displayMenu();
		userchoice = in.nextInt();
		switch(userchoice)
		{
		case 1:
		{
			UI.displayAddElementText();
			LList.addElement(in.nextInt());
			break;
		}
		case 2:
		{
			UI.displaygetElementText();
			LList.getElement(in.nextInt());
			break;
		}
		case 3:
		{
			UI.displaydeleteElementText();
			LList.deleteElement(in.nextInt());
			break;
		}
		case 4:
		{
			UI.displayPrintListtText();
			String choice = in.next();
			if (choice.equals("Head"))
			{
				LList.printLinkedListHead();
			}
			else if (choice.equals("Tail"))
			{
				LList.printLinkedListTail();
			}
			else
				System.out.println("Invalid input.");
			
			break;
		}
		}
	}

}
}
