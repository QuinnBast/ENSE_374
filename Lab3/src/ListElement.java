
public class ListElement {
	
	private ListElement next;	//Next Node
	private ListElement prev;	//Previous Node
	private int data;			//Data element
	
	public ListElement(){		//Default COnstructor
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	
	public ListElement(int data){	//Custom Constructor
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public int getData(){		//getData returns the data element
		return data;
	}
	
	public void setData(int data){	//setData sets the data element
		this.data = data;
	}
	
	public boolean hasNext(){		//hasNext determine if a listElement has a link forward
		return (this.next != null) ? true : false;
	}
	
	public ListElement getNext(){	//Returns the next element in the list
		return this.next;
	}
	
	public boolean hasPrev(){		//checks if there is a previous element
		return (this.next != null) ? true : false;
	}
	
	public ListElement getPrev(){	//returns the previous element in the list
		return this.prev;
	}
	
	public void setNext(ListElement value){	//sets the Next node to a specific node
		this.next = value;
	}
	
	public void setPrev(ListElement value){	//Sets the previous node to a specific node
		this.prev = value;
	}
}
