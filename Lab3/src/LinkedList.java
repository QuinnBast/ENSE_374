
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
		loop.setNext(data);
	}
	
	public ListElement getElement(int index){
		//This function will return a new ListElement if the function cannot find a node in the tree.
		//Therefore, if an element is not found, when a new node is returned, it will be initialized but not be in the tree.
		
		ListElement loop = head;
		int i = 0;
		
		if (head == null && index > 0)
		{
			return head;
		}
		else while (loop.hasNext() && i < index)
		{
			loop=loop.getNext();
			if (i == index)
				return loop;
			
			i++;
		}
		return (new ListElement());
	}

}
