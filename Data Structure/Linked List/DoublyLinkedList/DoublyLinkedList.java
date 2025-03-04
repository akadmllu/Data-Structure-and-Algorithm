
public class DoublyLinkedList<T> {
	//Length of list
	int jLength = 0;	
	//head of the list
	Node<T> objHead;	
	synchronized Node<T> getHead(){
		return objHead;
	}
}
