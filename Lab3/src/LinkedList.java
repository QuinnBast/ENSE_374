
public class LinkedList {
	
	private ListElement head = new ListElement();	//the head of the list
	private ListElement tail = new ListElement();	//the tail of the list
	
	public LinkedList(){		//Default constructor
		head = null;
		tail = null;
	}
	
	public void addElement(int data){	//add an Element to the list
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
		//This function will delete a node from the tree.
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
		else while (loop != null)
		{
			//There is only one element in the tree
			if (loop.hasNext() == false && index==0)
			{
				head = null;
				tail = null;
				return;
			}
			//If the next node should be deleted
			if (i + 1 == index)
			{
				//If there is a node to delete at that location
				if (loop.hasNext()){
					//If there is a node after it,
					if (loop.getNext().hasNext()){

						loop.setNext(loop.getNext().getNext());
						loop.getNext().setPrev(loop);
						System.out.println("Node deleted.");
						return;
					}
					//Otherwise, we are deleting the last element

					loop.setNext(new ListElement());
					tail = loop;
					System.out.println("Node deleted.");
					return;
				}
			}
			else
			{
				System.out.println("Index is larger than the list.");
				return;
			}
			i++;
			loop=loop.getNext();
		}
		System.out.println("Index is larger than the list.");
		return;
	}
	
	public void printLinkedListTail(){
		//Loops from the tail back and prints each element
		if(head == null)
		{
			System.out.println("Nothing in the list.");
		}
		
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
		if(head == null)
		{
			System.out.println("Nothing in the list.");
		}
		
		//Loops from the head and prints each element
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
