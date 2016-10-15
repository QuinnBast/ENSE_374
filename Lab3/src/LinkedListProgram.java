
public class LinkedListProgram {
	
	private static LinkedList LList = new LinkedList();
	
	public static void main(String args[])
	{

		LList.addElement(0);
		LList.addElement(1);
		LList.addElement(2);
		LList.addElement(3);
		LList.addElement(4);
		
		LList.getElement(0);	//Should find, OK
		LList.getElement(1);	//Should find, OK
		LList.getElement(4);	//Should find, OK
		LList.getElement(7);	//Should not Find, OK
		
		LList.deleteElement(2);	//Should delete, OK
		LList.getElement(4);	//Should not find after deleting, OK
		
		LList.deleteElement(4);	//Should not find, OK
		
		LList.printLinkedListTail();
		LList.printLinkedListHead();
	}

}
