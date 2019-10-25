public class Node<T>{
	//data on list
	private T data;
	//pointer to next node
	private Node<T> objNext;
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
	//Get the pointer to next node
	public Node<T> getNext() {
		return objNext;
	}
	//Set the pointer to next node
	public void setNext(Node<T> objNext) {
		this.objNext = objNext;
	}
}
