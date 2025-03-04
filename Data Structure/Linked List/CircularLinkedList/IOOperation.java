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
	synchronized void displayList(CircularLinkedList<Integer> objList) {
		if(objList.getTail().getNext() == null)
			System.out.println("\nList is Empty\n");
		else {
			Node<Integer> objTempNode = objList.getTail().getNext();
			System.out.print("\nLinked List : ");
			while(objTempNode.getNext() != objList.getTail().getNext()) {
				System.out.print(objTempNode.getData() + " | ");
				objTempNode = objTempNode.getNext();
			}
			if(objTempNode.getNext() == objList.getTail().getNext())
				System.out.println(objTempNode.getData() + "\n");
		}		
	}	
}
