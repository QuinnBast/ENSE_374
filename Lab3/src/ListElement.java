
public class ListElement {
	
	private ListElement next;
	private ListElement prev;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	
	public ListElement(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public boolean hasNext(){
		return (this.next != null) ? true : false;
	}
	
	public ListElement getNext(){
		return this.next;
	}
	
	public boolean hasPrev(){
		return (this.next != null) ? true : false;
	}
	
	public ListElement getPrev(){
		return this.prev;
	}
	
	public void setNext(ListElement value){
		this.next = value;
	}
	
	public void setPrev(ListElement value){
		this.prev = value;
	}
}
