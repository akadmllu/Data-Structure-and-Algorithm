import java.io.IOException;

public class InsertOperation<T> {
	//Insert the node at the beginning of list
	private synchronized boolean insertNodeAtBegin(SinglyLinkedList<T> objList,Node<T> objNode) {
		objNode.setNext(objList.getHead());
		objList.objHead = objNode;
		objList.jLength++;
		return true;
	}
	//Insert the node at the end of list
	private synchronized boolean insertNodeAtEnd(SinglyLinkedList<T> objList,Node<T> objNode) {
		if(objList.objHead == null) {
			objList.objHead = objNode;
			objList.jLength++;
			return true;
		}
		else {
			Node<T> objTempNode = objList.objHead;
			while(objTempNode.getNext() != null) {
				objTempNode = objTempNode.getNext();
			}
			if(objTempNode.getNext() == null)
				objTempNode.setNext(objNode);
			objList.jLength++;
			return true;
		}
	}
	//Insert node at any position
	private synchronized boolean insertNodeAtPosition(SinglyLinkedList<T> objList,Node<T> objNode,int jPosition) {
		if(jPosition < 0)
			jPosition = 0;
		else if(jPosition > objList.jLength++)
			jPosition = objList.jLength++;
		if(objList.objHead == null) {
			objList.objHead = objNode;
			objList.jLength++;
			return true;
		}
		else if(jPosition == 0) {
			return insertNodeAtBegin(objList,objNode);
		}
		else {
			Node<T> objTempNode = objList.objHead;
			for(int i = 0 ; i < jPosition - 1 ; i++) {
				objTempNode = objTempNode.getNext();
			}
			objNode.setNext(objTempNode.getNext());
			objTempNode.setNext(objNode);
			objList.jLength++;
			return true;
		}
	}
	//Insert Node in the list
	public void insertNode(SinglyLinkedList<T> objList)throws NumberFormatException,IOException {
		System.out.println("\n1. Insert At Begining\n2. Insert At End\n3. Insert At Position");
		System.out.print("Enter your Choice : ");
		int jChoiceForInsert = IOOperation.ReadDataFromConsole();
		System.out.print("\nEnter data : ");
		int data = IOOperation.ReadDataFromConsole();
		Node<T> objNode = (Node<T>)new Node<Integer>(data);
		switch(jChoiceForInsert) {
			case 1:
				if(insertNodeAtBegin(objList, objNode))
					System.out.println("\nNode Inserted at Begining\n");
				else {
					System.out.println("\nFailed To insert Node\n");
				}
				break;						
			case 2:
				if(insertNodeAtEnd(objList,objNode))
					System.out.println("\nNode Inserted at End\n");
				else {
					System.out.println("\nFailed To insert Node\n");
				}
				break;
			case 3:
				System.out.print("\nEnter Position : ");
				int jPosition = IOOperation.ReadDataFromConsole();
				if(insertNodeAtPosition(objList,objNode, jPosition))
					System.out.println("\nNode Inserted at Position "+ jPosition+"\n");
				else {
					System.out.println("\nFailed To insert Node\n");
				}
				break;
			default:
				System.out.println("\nInvalid Choice\n");
		}
	}
}
