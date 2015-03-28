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
	
	public void ForwardsTraverse(){
		DoublyLinkedNode<E> node = firstNode;
		System.out.print("Forwards: ");
		
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public void BackwardsTraverse(){
		DoublyLinkedNode<E> node = lastNode;
		System.out.print("Backwards: ");
		
		while(node != null){
			System.out.println(node.data + " ");
			node = node.prev;
		}
	}
	
	public void InsertAfter (DoublyLinkedNode<E> node, DoublyLinkedNode<E> newNode){
		newNode.prev = node;
		newNode.next = node.next;
		
		if(node.next == null){
			lastNode = newNode;
		}else{
			node.next.prev = newNode;
		}
		
		node.next = newNode;
	}
	
	
	
	
}
