public class SinglyLinkedList<T> {
	//Length of Linked List
	int jLength = 0;
	//Head of linked List
	Node<T> objHead;
	//Get the head of List
	public synchronized Node<T> getHead() {
		return objHead;
	}	
}
