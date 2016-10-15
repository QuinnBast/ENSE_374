
public class ListElement {
	
	private ListElement next;
	private int data;
	
	public ListElement(){
		this.data = 0;
		this.next = null;
	}
	
	public ListElement(int data){
		this.data = data;
		this.next = null;
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
	
	public void setNext(ListElement value){
		this.next = value;
	}
}
