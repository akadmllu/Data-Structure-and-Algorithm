
public class CircularLinkedList<T> {
	//Length of list
	int jLength = 0;	
	//head of the list
	Node<T> objTail;	
	synchronized Node<T> getTail(){
		return objTail;
	}
}
