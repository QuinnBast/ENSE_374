
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

}
