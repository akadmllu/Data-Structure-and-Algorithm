
public class Node<T> {
	//data on list
	private T data;
	//pointer to next node
	private Node<T> objNext;
	//point to previous node
	private Node<T> objPrev;
	//Constructor of list
	Node(T data){
		this.data = data;
	}
	//Get the Data of node
	public T getData() {
		return data;
	}
	//Set the data of node
	public void setData(T data) {
		this.data = data;
	}	
	//Set the pointer to next node
	public void setNext(Node<T> objNext) {
		this.objNext = objNext;
	}
	//Set the pointer to previous node
	public void setPrev(Node<T> objPrev) {
		this.objPrev = objPrev;
	}
	//Get the pointer to next node
	public Node<T> getNext() {
		return objNext;
	}
	//Get the pointer to previous node
	public Node<T> getPrev() {
		return objPrev;
	}
	
}
