package iis.doublylinkedlist;

public class DoublyLinkedList <E>{
	
	private DoublyLinkedNode<E> firstNode;
	private DoublyLinkedNode<E> lastNode;
	
	public DoublyLinkedList(){
	  firstNode = null;
	  lastNode = null;
	}
	
	public DoublyLinkedList (DoublyLinkedNode<E> node){
		node.prev = null;
		node.next = null;
		firstNode = node;
		lastNode = node;
	}
	
	public DoublyLinkedList (DoublyLinkedNode<E> first, DoublyLinkedNode<E> last){
		firstNode = first;
		firstNode.next = last;
		firstNode.prev = null;
		lastNode = last;
		lastNode.prev = first;
		lastNode.next = null;
	}
	
	public DoublyLinkedNode<E> getFirstNode(){
	  return firstNode;
	}
	
	public DoublyLinkedNode<E> getLastNode(){
	  return lastNode;
	}
	
	public String forwardsTraverse(){
		DoublyLinkedNode<E> node = firstNode;
		System.out.print("Forwards: ");
		
		String s = "";
		while(node != null){
			s = s + node.data + " ";
			node = node.next;
		}
		return s;
	}
	
	public String backwardsTraverse(){
		DoublyLinkedNode<E> node = lastNode;
		System.out.print("Backwards: ");
		
		String s = "";
		while(node != null){
			s = s + node.data + " ";
			node = node.prev;
		}
		
		return s;
	}
	
	public void insertAfter (DoublyLinkedNode<E> node, DoublyLinkedNode<E> newNode){
		newNode.prev = node;
		newNode.next = node.next;
		
		if(node.next == null){
			lastNode = newNode;
		}else{
			node.next.prev = newNode;
		}
		
		node.next = newNode;
	}
	
	public void insertBefore (DoublyLinkedNode<E> node, DoublyLinkedNode<E> newNode){
		newNode.next = node;
		newNode.prev = node.prev;
		
		if(node.prev == null){
			firstNode = newNode;
		}else{
			node.prev.next = newNode;
		}
		
		node.prev = newNode;
	}
	
	public void insertBeginning (DoublyLinkedNode<E> newNode){
		if(firstNode == null){
			newNode.next = null;
			newNode.prev = null;
			firstNode = newNode;
			lastNode = newNode;
		}else{
			insertBefore(firstNode, newNode);
		}
	}
	
	public void insertEnd (DoublyLinkedNode<E> newNode){
		if(lastNode == null){
			insertBeginning(newNode);
		}else{
			insertAfter(lastNode, newNode);
		}
	}
	
	public void remove (DoublyLinkedNode<E> node){
		DoublyLinkedNode<E> n = firstNode;
		boolean nodeIsInTheList = false;
		
		//loop to check if the node is in the list
		while(n != null && !nodeIsInTheList){
			if(n == node){
				nodeIsInTheList = true;
				break;
			}
			n = n.next;
		}
		
		if(!nodeIsInTheList){
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
