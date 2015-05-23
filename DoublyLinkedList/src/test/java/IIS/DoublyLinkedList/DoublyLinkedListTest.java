package IIS.DoublyLinkedList;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoublyLinkedListTest {

  // Dado que también hemos realizado pruebas unitarias de la clase DoublyLinkedNode, me abstengo de
  // realizar pruebas usando mocking

  @Rule
  public ExpectedException excepcion = ExpectedException.none();

  @Test
  public void ProbandoConstructorDeListaVacia() {
    DoublyLinkedList<Integer> lista = new DoublyLinkedList();
    assertNull(lista.getLastNode());
    assertNull(lista.getFirstNode());
  }

  @Test
  public void ProbandoConstructorDeListaConUnNodo() {
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(1);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList(nodo);
    assertEquals(lista.getLastNode(), lista.getLastNode());
    assertEquals(nodo, lista.getFirstNode());
  }

  @Test
  public void ProbandoConstructorConDosNodos() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    assertEquals(nodo1, lista.getFirstNode());
    assertEquals(nodo2, lista.getLastNode());
    assertEquals("1 2 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoObtenerPrimerNodo() {
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(1);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList(nodo);
    assertEquals(nodo, lista.getFirstNode());
  }

  @Test
  public void ProbandoObtenerUltimoNodo() {
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(1);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList(nodo);
    assertEquals(nodo, lista.getLastNode());
  }

  @Test
  public void ProbandoElRecorridoHaciaAdelante() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    String salida = lista.forwardsTraverse();
    assertEquals("1 2 ", salida);
  }

  @Test
  public void ProbandoRecorridoInverso() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    String salida = lista.backwardsTraverse();
    assertEquals("2 1 ", salida);
  }

  @Test
  public void ProbandoAInsertarDespuesDeUnNodoFinal() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 al final.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertAfter(nodo2, nodo3);
    assertEquals(nodo3, lista.getLastNode());
  }

  @Test
  public void ProbandoAInsertarDespuesDeUnNodo() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 en mitad.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertAfter(nodo1, nodo3);
    assertEquals("1 3 2 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoLaInsercionAntesDeUnNodoPrimero() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 antes del 1.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertBefore(nodo1, nodo3);
    assertEquals("3 1 2 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoLaInsercionAntesDeUnNodo() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 antes del 2.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertBefore(nodo2, nodo3);
    assertEquals("1 3 2 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoInsercionAlComienzo() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 al comienzo.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertBeginning(nodo3);
    assertEquals(nodo3, lista.getFirstNode());
    assertEquals("3 1 2 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoInsercionAlComienzoDeUnaListaVacia() {
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>();
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 al comienzo.
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(3);
    lista.insertBeginning(nodo);
    assertEquals(nodo, lista.getFirstNode());
    assertEquals("3 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoInsercionAlFinal() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 al final.
    DoublyLinkedNode<Integer> nodo3 = new DoublyLinkedNode(3);
    lista.insertEnd(nodo3);
    assertEquals(nodo3, lista.getLastNode());
    assertEquals("1 2 3 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoInsercionAlFinalDeUnaListaVacia() {
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>();
    // hasta aquí una lista con uno y dos, probaremos a insertar un 3 al comienzo.
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(3);
    lista.insertEnd(nodo);
    assertEquals(nodo, lista.getLastNode());
    assertEquals("3 ", lista.forwardsTraverse());
  }

  @Test
  public void ProbandoEliminacionDeUnNodoEnUnaListaVacia() {
    excepcion.expect(RuntimeException.class);
    excepcion.expectMessage("ERROR: The node is not in the list.");
    DoublyLinkedList<Integer> lista = new DoublyLinkedList();
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(7);
    lista.remove(nodo);
  }

  @Test
  public void ProbandoEliminacionDeUnNodoQueNoFiguraEnLaLista() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    DoublyLinkedNode<Integer> nodo = new DoublyLinkedNode(7);
    excepcion.expect(RuntimeException.class);
    excepcion.expectMessage("ERROR: The node is not in the list.");
    lista.remove(nodo);
  }

  @Test
  public void ProbandoEliminacionDelPrimerNodoDeLaLista() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    lista.remove(nodo1);
  }

  @Test
  public void ProbandoEliminacionDelUltimoNodoDeLaLista() {
    DoublyLinkedNode<Integer> nodo1, nodo2;
    nodo1 = new DoublyLinkedNode(1);
    nodo2 = new DoublyLinkedNode(2);
    DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>(nodo1, nodo2);
    lista.remove(nodo2);
  }

}
