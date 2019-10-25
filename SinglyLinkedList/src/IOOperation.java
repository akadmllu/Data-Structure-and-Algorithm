import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOOperation {
	//Read data from console
	static int ReadDataFromConsole() throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}
	//Display all the element of List
	synchronized void displayList(SinglyLinkedList<Integer> objList, Node<Integer> objHead) {
		if(objHead == null)
			System.out.println("\nList is Empty\n");
		else {
			Node<Integer> objTempNode = objHead;
			System.out.print("\nLinked List : ");
			while(objTempNode.getNext() != null) {
				System.out.print(objTempNode.getData() + " | ");
				objTempNode = objTempNode.getNext();
			}
			if(objTempNode.getNext() == null)
				System.out.println(objTempNode.getData() + "\n");
		}		
	}	
}
