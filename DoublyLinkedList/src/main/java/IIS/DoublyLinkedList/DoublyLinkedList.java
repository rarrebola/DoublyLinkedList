package IIS.DoublyLinkedList;

public class DoublyLinkedList <E>{
	
	public class DoublyLinkedNode<T>{
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
	
	DoublyLinkedNode<E> firstNode;
	DoublyLinkedNode<E> lastNode;
	
	public DoublyLinkedList (DoublyLinkedNode<E> node){
		firstNode = node;
		lastNode = null;
	}
	
	public DoublyLinkedList (DoublyLinkedNode<E> first, DoublyLinkedNode<E> last){
		firstNode = first;
		lastNode = last;
	}
	
	
}
