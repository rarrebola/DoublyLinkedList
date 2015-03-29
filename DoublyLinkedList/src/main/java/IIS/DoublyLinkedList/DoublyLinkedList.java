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
		node.prev = null;
		node.next = null;
		firstNode = node;
		lastNode = node;
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
	
	public void InsertBefore (DoublyLinkedNode<E> node, DoublyLinkedNode<E> newNode){
		newNode.next = node;
		newNode.prev = node.prev;
		
		if(node.prev == null){
			firstNode = newNode;
		}else{
			node.prev.next = newNode;
		}
		
		node.prev = newNode;
	}
	
	public void InsertBeginning (DoublyLinkedNode<E> newNode){
		if(firstNode == null){
			newNode.next = null;
			newNode.prev = null;
			firstNode = newNode;
			lastNode = newNode;
		}else{
			InsertBefore(firstNode, newNode);
		}
	}
	
	public void InsertEnd (DoublyLinkedNode<E> newNode){
		if(lastNode == null){
			InsertBeginning(newNode);
		}else{
			InsertAfter(lastNode, newNode);
		}
	}
	
	public void remove (DoublyLinkedNode<E> node){
		DoublyLinkedNode<E> n = firstNode;
		boolean node_is_in_the_list = false;
		
		//loop to check if the node is in the list
		while(n != null && !node_is_in_the_list){
			if(n == node){
				node_is_in_the_list = true;
				break;
			}
			n = n.next;
		}
		
		if(!node_is_in_the_list){
			throw new RuntimeException("ERROR: The node is not in the list.");
		}else{
			if (node.prev == null){
				firstNode = node.next;
			}else{
				node.prev.next = node.next;
			}
			
			if(node.next == null){
				lastNode = node.prev;
			}else{
				node.next.prev = node.prev;
			}
		}
		
	}
}
