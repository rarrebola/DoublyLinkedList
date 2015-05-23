package IIS.DoublyLinkedList;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoublyLinkedNodeTest {

  @Rule
  public ExpectedException excepcion = ExpectedException.none();

  @Test
  public void ProbandoConstructorVacio() {
    DoublyLinkedNode<Integer> node = new DoublyLinkedNode();
    assertEquals(null, node.prev);
    assertEquals(null, node.next);
    assertEquals(null, node.data);
  }

  @Test
  public void ProbandoACrearUnNodoSinDato() {
    excepcion.expect(DoublyLinkedNodeException.class);
    excepcion.expectMessage("El valor del nodo no puede ser vacío");
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(null);
  }

  @Test
  public void ProbandoACrearUnNodoEntero() {
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(7);
    assertNull(nodo.prev);
    assertNull(nodo.next);
    assertEquals(new Integer(7), nodo.data);
  }

  @Test
  public void ProbandoConstructorConNodoPrevioYPosterior() {
    DoublyLinkedNode<Integer> nodo1 = new DoublyLinkedNode(1);
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    DoublyLinkedNode<Integer> nodo2 = new DoublyLinkedNode(nodo1, nodo3, 2);
    assertEquals(nodo1, nodo2.prev);
    assertEquals(nodo3, nodo2.next);
    assertEquals(new Integer(2), nodo2.data);
  }

  @Test
  public void ProbandoConstructorConNodoPrevioYPosteriorVacío() {
    DoublyLinkedNode<Integer> nodo1 = new DoublyLinkedNode(1);
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    excepcion.expect(DoublyLinkedNodeException.class);
    excepcion.expectMessage("El valor del nodo no puede ser vacío");
    DoublyLinkedNode<Integer> nodo2 = new DoublyLinkedNode(nodo1, nodo3, null);

  }

}
