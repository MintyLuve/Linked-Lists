public class Main{

    public static void main(String args[]){
		System.out.println("  * Inserting and Extracting *");
		/*		Operations at the Beginning of a List		 */
        // Create a linked list using MyLinkedList<Integer>
	    MyLinkedList<Integer> inserting = new MyLinkedList<Integer>();
	   
		// Inserting from the beginning of a list
	    System.out.println("Inserting at beginning");
	    for (int i=0; i< 10; i++){
	        inserting.insertBeginning(i);
	    }
	    //Print the whole list
	    inserting.print();
	    
	    //Extract all the elements from the list from the beginning
	    System.out.println("Extracting from beginning");
        Integer bar;
        while( (bar=inserting.extractBeginning()) != null){
            System.out.print(bar + " ");
        }
        	  
		
		/*		Operations at the End of a List		 */
        System.out.println("\n\nInserting at the end");
	    // Inserting from the end of a list
	    for (int i=0; i< 10; i++){
	        inserting.insertEnd(i);
	    }
	    inserting.print();

        //Extract all the elements from the list from the end
        System.out.println("Extracting from the end");
        while( (bar=inserting.extractEnd()) != null){
            System.out.print(bar + " ");
        }
        

		/*		Inserting Sorted List 		*/
		System.out.println("\n\n  * Inserting sorted lists *");
		// Creating a new Integer list
	    MyLinkedList<Integer> sortedInt = new MyLinkedList<Integer>();
	    for (int i=0; i< 10; i++){
	        sortedInt.insertSorted((int)(100*Math.random()));
	    }
		//Print the list
		System.out.println("Inserting sorted integer list");
		sortedInt.print();

		// Creating a new string list
	    MyLinkedList<String> sortedString = new MyLinkedList<String>();
		// Insert Strings 
		sortedString.insertSorted("Hello");
		sortedString.insertSorted("Programming");
		sortedString.insertSorted("Java");
		sortedString.insertSorted("Data");
		sortedString.insertSorted("Algorithms");
	    //Print the list
		System.out.println("Inserting sorted String list");
		sortedString.print();


		/*		Deleting First Occurrence		 */
		// Creating a new list
	    MyLinkedList<Integer> deleting = new MyLinkedList<Integer>();
	    boolean success;
	    for (int i=0; i< 10; i++){
	        deleting.insertBeginning(i);
	        deleting.insertEnd(i);
	    }
	    
		//Testing
	    System.out.println("\n  * Deleting first occurrence of a value *");
	    deleting.print();
	    
	    System.out.print("Deleting 5: ");
	    success = deleting.deleteFirstOccurrence(5);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    deleting.print();
	    
	    System.out.print("Deleting 5: ");
	    success = deleting.deleteFirstOccurrence(5);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    deleting.print();
	    
	    System.out.print("Deleting 0: ");
	    success = deleting.deleteFirstOccurrence(0);
	    if (success){ System.out.println("First occurence deleted"); }
		else{ System.out.println("Element with that info not found"); }
	    deleting.print();
	    

	    /* 		Deleting All Occurrences		 */
	    // Creating a new list
		deleting = new MyLinkedList<Integer>();
	    int numberdeleted;
	    for (int i=0; i< 10; i++){
	        deleting.insertEnd(i);
	        deleting.insertBeginning(i);
	    }

		//Testing
	    System.out.println("\n  * Deleting of all the occurrences of a value: *");
	    deleting.print();
	    
	    System.out.print("Deleting 9: ");
	    numberdeleted = deleting.deleteAllOccurrence(9);
	    System.out.println(numberdeleted + " deleted nodes");
	    deleting.print();
		System.out.print("Deleting 100: ");
	    numberdeleted = deleting.deleteAllOccurrence(100);
	    System.out.println(numberdeleted + " deleted nodes");
	    deleting.print();
    
    }
}