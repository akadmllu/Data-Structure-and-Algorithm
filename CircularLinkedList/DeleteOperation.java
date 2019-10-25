import java.io.IOException;

public class DeleteOperation<T> {
	//Delete the node at the begining of list
	private boolean deleteNodeAtBegin(CircularLinkedList<T> objList) {
		if(objList.objTail == null){	
			System.out.println("List is empty");
			return false;
		}else {
			objList.objTail.setNext(objList.getTail().getNext().getNext());
			objList.jLength--;
			return true;			
		}
	}
	//Delete the node at the end of list
	private boolean deleteNodeAtEnd(CircularLinkedList<T> objList) {
		if(objList.objTail == null) {
			System.out.println("List is empty");
			return false;
		}
		else if(objList.jLength == 1) {
			objList.objTail = null;
			objList.jLength--;
			return true;
		}
		else {
			Node<T> objTempNode = objList.objTail.getNext();
			for(int i = 1 ; i < objList.jLength - 1 ; i++) {
				objTempNode = objTempNode.getNext();
			}
			objTempNode.setNext(objList.getTail().getNext().getNext());
			objList.jLength--;
			return true;
		}
	}
	//Delete node at any position
	private boolean deleteNodeAtPosition(CircularLinkedList<T> objList,int jPosition) {
		if(jPosition < 0)
			jPosition = 0 ;
		else if(jPosition > objList.jLength){
			jPosition = objList.jLength - 1;
		}		
		if(objList.objTail == null)
		{
			System.out.println("\nList is empty\n");
			return false;
		}
		else if(jPosition == 0) {
			return deleteNodeAtBegin(objList);
		}
		else {
			Node<T> objTempNode = objList.getTail().getNext();
			for(int i = 1 ; i < jPosition ; i++) {
				objTempNode = objTempNode.getNext();
			}
			objTempNode.setNext(objTempNode.getNext().getNext());
			objList.jLength--;
			return true;
		}
	}
	//delete node from list
	public void deleteNode(CircularLinkedList<T> objList)throws NumberFormatException,IOException{
		System.out.println("\n1. Delete From Begining\n2. Delete From End\n3. Delete At Position");
		System.out.print("Enter your Choice : ");
		int jChoiceForInsert = IOOperation.ReadDataFromConsole();
		switch(jChoiceForInsert) {
			case 1:
				if(deleteNodeAtBegin(objList))
					System.out.println("\nNode Deleted from Begining\n");
				else {
					System.out.println("\nFailed To delete Node\n");
				}
				break;						
			case 2:
				if(deleteNodeAtEnd(objList))
					System.out.println("\nNode Deleted from End\n");
				else {
					System.out.println("\nFailed To Delete Node\n");
				}
				break;
			case 3:
				System.out.print("\nEnter Position : ");
				int jPosition = IOOperation.ReadDataFromConsole();
				if(deleteNodeAtPosition(objList,jPosition))
					System.out.println("\nNode Deleted at Position "+ jPosition+"\n");
				else {
					System.out.println("\nFailed To Delete Node\n");
				}
				break;
			default:
				System.out.println("\nInvalid Choice\n");
		}
	}
}
