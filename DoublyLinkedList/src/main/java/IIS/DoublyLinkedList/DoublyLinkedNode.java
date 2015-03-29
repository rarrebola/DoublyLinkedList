package IIS.DoublyLinkedList;

public class DoublyLinkedNode<T> {
	DoublyLinkedNode<T> prev;
	DoublyLinkedNode<T> next;
	T data;
	
	public DoublyLinkedNode (T data){
		prev = null;
		next = null;
		this.data = data;
	}
	
	public DoublyLinkedNode (DoublyLinkedNode<T> prev, DoublyLinkedNode<T> next, T data){
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
}
