package iis.doublylinkedlist;


public class App {
	public static final int V1 =3;
	public static final int V2 = 4;
	public static final int V3 = 14;
	public static final int V4 = 9;
	public static final int V5 = 13;
	public static final int V6 = 6;
	
	private App(){
		
	}
	
    public static void main( String[] args ){
    	DoublyLinkedNode<Integer> n1 = new DoublyLinkedNode<Integer>(V1);
    	DoublyLinkedNode<Integer> n2 = new DoublyLinkedNode<Integer>(V2);
    	
    	DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(n1, n2);
    	
    	System.out.println("\nFirst traverse: \n");
    	System.out.println(list.forwardsTraverse());
    	System.out.println(list.backwardsTraverse());
    	
    	DoublyLinkedNode<Integer> newNode1 = new DoublyLinkedNode<Integer>(V3);
    	list.insertAfter(n2, newNode1);
    	
    	DoublyLinkedNode<Integer> newNode2 = new DoublyLinkedNode<Integer>(V4);
    	list.insertAfter(newNode1, newNode2);
    	
    	DoublyLinkedNode<Integer> newNode3 = new DoublyLinkedNode<Integer>(V5);
    	list.insertBeginning(newNode3);
    	
    	DoublyLinkedNode<Integer> newNode4 = new DoublyLinkedNode<Integer>(V6);
    	list.insertEnd(newNode4);
    	
    	System.out.println("\n Second traverse: \n");
    	System.out.println(list.forwardsTraverse());
    	System.out.println(list.backwardsTraverse());
    	
    	System.out.println("\n Last traverse: \n");
    	list.remove(newNode2);
    	
    	System.out.println(list.forwardsTraverse());
    	System.out.println(list.backwardsTraverse());
    }
}
