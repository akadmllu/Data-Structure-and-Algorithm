import java.io.IOException;

public class EntryPoint {
	public static void main(String[] args) {		
		DoublyLinkedList<Integer> objList = new DoublyLinkedList<Integer>();
		while(true) {
			System.out.println("1. Insert\n2. Display\n3. Delete\n4. Exit");
			System.out.print("Enter your Choice : ");
			
			int jChoice;
			try {
				jChoice = IOOperation.ReadDataFromConsole();
				switch(jChoice) {
					case 1:
						InsertOperation objInsertOperation = new InsertOperation();
						objInsertOperation.insertNode(objList);
						break;					
					case 2:
						IOOperation objIOOperation = new IOOperation();
						objIOOperation.displayList(objList,objList.objHead);
						break;
					case 3 :
						DeleteOperation objDeleteOperation = new DeleteOperation<>();
						objDeleteOperation.deleteNode(objList);
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.out.println("\nInvalid Choice\n");		
				}
			}
			catch (NumberFormatException e1) {
				System.out.println("\nInvalid Input\n");
			}
			catch (IOException e) {
				System.out.println("\nInvalid Input\n");
			}			
		}
	}
}
