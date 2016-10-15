
public class LinkedList {
	
	private ListElement head = new ListElement();
	
	public LinkedList(){
		head = null;
	}
	
	public void addElement(int data){
		ListElement loop = head;
		if (head == null)
		{
			head = new ListElement(data);
			return;
		}
		while (loop.hasNext()){
			loop = loop.getNext();
		}
		loop.setNext(new ListElement(data));
	}
	
	public ListElement getElement(int index){
		//This function will return a new ListElement if the function cannot find a node in the tree.
		//Therefore, if an element is not found, when a new node is returned, it will be initialized but not be in the tree.
		
		ListElement loop = head;
		int i = 0;
		
		if (head == null && index > 0)
		{
			System.out.println("The List is empty.");
			return head;
		}
		else while (i <= index)
		{
			if (i == index)
			{
				System.out.println("Node Found.");
				return loop;
			}
			else if (loop.hasNext())
			{
				i++;
				loop = loop.getNext();
			}
			else
			{
				System.out.println("Index is larger than the list.");
				return (new ListElement());
			}
		}
		System.out.println("Index is larger than the list.");
		return (new ListElement());
	}

	public void deleteElement(int index)
	{
		//This function will return a new ListElement if the function cannot find a node in the tree.
		//Therefore, if an element is not found, when a new node is returned, it will be initialized but not be in the tree.
		
		ListElement loop = head;
		int i = 0;
		
		if (head == null)
		{
			System.out.println("The List is empty.");
			return;
		}
		//The head is being deleted.
		if (index == 0)
		{
			head = head.getNext();
			System.out.println("Node deleted.");
			return;
		}
		else while (i <= index)
		{
			if (loop.hasNext() == false)
			{
				System.out.println("Index is larger than the list.");
				return;
			}
			if ((i + 1 == index) && (loop.getNext().hasNext() == false))
			{
				loop.setNext(new ListElement());
				System.out.println("Node deleted.");
				return;
			}
			else if (i + 1 == index)
			{
				loop.setNext(loop.getNext().getNext());
				System.out.println("Node deleted.");
				return;
			}
			i++;
			loop=loop.getNext();
		}
	}
	
	public void printLinkedListTail(){
		ListElement sentinel = head;
		
		//Check if the list is empty
		if (head == null)
		{
			System.out.println("Nothing in the List.");
			return;
		}
		//Count the number of elements in the list.
		int numberOfElements=1;
		while (sentinel.hasNext())
		{
			sentinel = sentinel.getNext();
			numberOfElements++;
		}
		
		//Create an array with the size that was found
		int[] ArrayList = new int[numberOfElements];
		sentinel = head;	//Reset the sentinel
		int i=0;
		do
		{		//Traverse the list, adding each data element into the array
			ArrayList[i]=sentinel.getData();
			sentinel = sentinel.getNext();
			i++;
		} while (sentinel != null);
		
		for (i=(numberOfElements-1); i>=0; i--)
		{
			//Print out the array backwards.
			System.out.println("List from tail:" + ArrayList[i]);
		}
		return;
	}
}
