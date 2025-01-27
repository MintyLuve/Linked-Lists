public class Main{
    public static void main(String args[]){
		System.out.println("  * Inserting and Extracting *");
		/*		Operations at the Beginning of a List		 */
	    // Create a linked list using MyLinkedList<Integer>
	    MyDoublyLinkedList<Integer> mine = new MyDoublyLinkedList<Integer>();
	    System.out.println("Inserting at beginning");
	    // Insert the first 10 ints at the beginning
	    for (int i=0; i< 10; i++){
	        mine.insertBeginning(i);
	    }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
		//Extract all the elements from the list from the beginning
	    System.out.println("Extracting from beginning");
        Integer bar;
        while( (bar=mine.extractBeginning()) != null){
            System.out.print(bar + " ");
        }
        System.out.println();
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    

		/*		Operations at the End of a List		 */
        System.out.println("Inserting at the end");
	    // Insert 10 ints at the end
	    for (int i=0; i< 10; i++){
	        mine.insertEnd(i);
	    }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    
        //Extract all the elements from the list from the beginning
		System.out.println("Extracting from the end");
        while( (bar=mine.extractEnd()) != null){
            System.out.print(bar + " ");
        }
        System.out.println();
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
		/*		Inserting Sorted List 		*/
		System.out.println("\n  * Inserting sorted lists *");
		// Creating a new Integer list
	    mine = new MyDoublyLinkedList<Integer>();
	    for (int i=0; i< 10; i++){
	        mine.insertSorted((int)(100*Math.random()));
	    }
		//Print the list
		System.out.println("Inserting sorted integer list");
		System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();

		// Creating a new string list
	    MyDoublyLinkedList<String> mineString = new MyDoublyLinkedList<String>();
		// Insert Strings 
		mineString.insertSorted("Hello");
		mineString.insertSorted("Programming");
		mineString.insertSorted("Java");
		mineString.insertSorted("Data");
		mineString.insertSorted("Algorithms");
	    //Print the list
		System.out.println("Inserting sorted String list");
		System.out.print("Forwards:  ");
	    mineString.printForward();
	    System.out.print("Backwards: ");
	    mineString.printBackwards();


		/*		Deleting First Occurrence		 */
		// Creating a new list
		mine = new MyDoublyLinkedList<>();
	    boolean success = false;
	    for (int i=0; i< 3; i++){
	        mine.insertBeginning(0);
	        mine.insertBeginning(1);
	        mine.insertBeginning(2);
	    }
	    
		//Testing
	    System.out.println("\n  * Deleting first occurrence of a value *");
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 2: ");
	    success = mine.deleteFirstOccurrence(2);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 2: ");
	    success = mine.deleteFirstOccurrence(2);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 0: ");
	    success = mine.deleteFirstOccurrence(0);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
		/*		Deleting Last Occurrence		 */
		// Creating a new list
		mine = new MyDoublyLinkedList<>();
	    success = false;
	    for (int i=0; i< 3; i++){
	        mine.insertBeginning(0);
	        mine.insertBeginning(1);
	        mine.insertBeginning(2);
	    }
	    
		//Testing
	    System.out.println("\n  * Deleting last occurrence of a value *");
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 1: ");
	    success = mine.deleteLastOccurrence(1);
	    if (success){ System.out.println("Last occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 1: ");
	    success = mine.deleteLastOccurrence(1);
	    if (success){ System.out.println("Last occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    System.out.print("Deleting 2: ");
	    success = mine.deleteLastOccurrence(2);
	    if (success){ System.out.println("Last occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();

	    /* 		Deleting All Occurrences		 */ 
		System.out.println("\n  * Deleting All Occurrences *");
		mine = new MyDoublyLinkedList<>();
	    System.out.println("Inserting at beginning");
	    // Insert the first 10 ints at the beginning
	    for (int i=0; i< 3; i++){
	        mine.insertBeginning(0);
	        mine.insertBeginning(1);
	        mine.insertBeginning(2);
	    }
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    int deleted, value;
	    
	    value = 0;
	    deleted = mine.deleteAllOccurrence(value);
	    System.out.println("Deleted "+deleted +" nodes with info = "+value);
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    value = 0;
	    deleted = mine.deleteAllOccurrence(value);
	    System.out.println("Deleted "+deleted +" nodes with info = "+value);
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
	    
	    value = 1;
	    deleted = mine.deleteAllOccurrence(value);
	    System.out.println("Deleted "+deleted +" nodes with info = "+value);
	    System.out.print("Forwards:  ");
	    mine.printForward();
	    System.out.print("Backwards: ");
	    mine.printBackwards();
    }
}