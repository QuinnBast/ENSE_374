
public class LinkedList {
	
	private ListElement head = new ListElement();
	private ListElement tail = new ListElement();
	
	public LinkedList(){
		head = null;
	}
	
	public void addElement(int data){
		if (head == null)
		{
			head = new ListElement(data);
			tail = head;
			return;
		}
		else
		{
		tail.setNext(new ListElement(data));
		tail.getNext().setPrev(tail);
		tail = tail.getNext();
		}
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
			head.setPrev(new ListElement());
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
			//If the node is the last node in the list
			if ((i + 1 == index) && (loop.getNext().hasNext() == false))
			{
				loop.setNext(new ListElement());
				tail = loop;
				System.out.println("Node deleted.");
				return;
			}
			else if (i + 1 == index)
			{
				loop.setNext(loop.getNext().getNext());
				loop.getNext().setPrev(loop);
				System.out.println("Node deleted.");
				return;
			}
			i++;
			loop=loop.getNext();
		}
	}
	
	public void printLinkedListTail(){
		ListElement sentinel = tail;
		System.out.println("List from tail:");
		while (sentinel != null)
		{
			System.out.println(sentinel.getData());
			sentinel = sentinel.getPrev();
		}
		return;
	}
	
	public void printLinkedListHead()
	{
		ListElement sentinel = head;
		System.out.println("List from head:");
		while (sentinel != null)
		{
			System.out.println(sentinel.getData());
			sentinel = sentinel.getNext();
		}
		return;
	}
}
