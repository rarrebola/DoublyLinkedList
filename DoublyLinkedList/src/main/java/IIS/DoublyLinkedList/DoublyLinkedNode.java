package iis.doublylinkedlist;

public class DoublyLinkedNode<T> {
	DoublyLinkedNode<T> prev;
	DoublyLinkedNode<T> next;
	T data;
	
	public DoublyLinkedNode(){
	  data = null;
	  prev = null;
	  next = null;
	}
	
	public DoublyLinkedNode (T data){
	  if(data == null){
	    throw new DoublyLinkedNodeException ("El valor del nodo no puede ser vacío");
	  }
		prev = null;
		next = null;
		this.data = data;
	}
	
	public DoublyLinkedNode (DoublyLinkedNode<T> prev, DoublyLinkedNode<T> next, T data){
	  if(data == null){
	    throw new DoublyLinkedNodeException("El valor del nodo no puede ser vacío");
	  }
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
}
