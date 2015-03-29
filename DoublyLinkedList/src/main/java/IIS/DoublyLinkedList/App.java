package IIS.DoublyLinkedList;


public class App 
{
    public static void main( String[] args )
    {
    	DoublyLinkedNode<Integer> n1 = new DoublyLinkedNode<Integer>(3);
    	DoublyLinkedNode<Integer> n2 = new DoublyLinkedNode<Integer>(4);
    	
    	DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(n1, n2);
    	
    	System.out.println("\nFirst traverse: \n");
    	list.ForwardsTraverse();
    	list.BackwardsTraverse();
    	
    	DoublyLinkedNode<Integer> new_node_1 = new DoublyLinkedNode<Integer>(5);
    	list.InsertAfter(n2, new_node_1);
    	
    	DoublyLinkedNode<Integer> new_node_2 = new DoublyLinkedNode<Integer>(6);
    	list.InsertAfter(new_node_1, new_node_2);
    	
    	DoublyLinkedNode<Integer> new_node_3 = new DoublyLinkedNode<Integer>(14);
    	list.InsertBeginning(new_node_3);
    	
    	DoublyLinkedNode<Integer> new_node_4 = new DoublyLinkedNode<Integer>(9);
    	list.InsertEnd(new_node_4);
    	
    	System.out.println("\n Second traverse: \n");
    	list.BackwardsTraverse();
    	list.ForwardsTraverse();
    	
    	System.out.println("\n Last traverse: \n");
    	list.remove(new_node_2);
    	
    	list.BackwardsTraverse();
    	list.ForwardsTraverse();
    }
}
