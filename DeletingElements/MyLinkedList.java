package DeletingElements;

public class MyLinkedList<E>{
    private Node<E> first;
    
    public MyLinkedList(){
	    this.first = null;
    }
    
    /*
     * Insertion at the beginning
     */
    public void insert(E info){
	    Node<E> newNode = new Node<E>(info);
	    newNode.setNext(first);
	    first = newNode;
    }
    /*
     * Delete the first occurrence of a value 
     * Return a boolean stating if the delete was successful
     */
    public boolean deleteFirstOccurrence(E info){
        boolean success = false;
        Node<E> currentNode = first;

         while (currentNode.getNext() != null && !success){
            Node<E> nextNode = currentNode.getNext();
            if(currentNode == first && currentNode.getInfo() == info) {
                first = first.getNext();
                currentNode = first;
                success = true;
            }
            else if (nextNode.getInfo() == info){
                currentNode.setNext(nextNode.getNext());
                success = true;
            }
            else{
                currentNode = nextNode;
            }
        }
        return success;
    }
    /*
     * Delete all the occurrences of a value
     * Returns the number of deleted nodes
     * You can use deleteFirstOccurrence
     */
     public int deleteAll(E info){
         int number = 0;
         Node<E> currentNode = first;

         while (currentNode.getNext() != null){
            Node<E> nextNode = currentNode.getNext();
            if(currentNode == first && currentNode.getInfo() == info) {
                first = first.getNext();
                currentNode = first;
                number++;
            }
            else if (nextNode.getInfo() == info){
                currentNode.setNext(nextNode.getNext());
                number++;
            }
            else{
                currentNode = nextNode;
            }
        }
        // Implement this method
        return number;
    }
    /*
     * Extraction of the first node
     */
    public E extract(){
	    E data = null;
	    if (first != null){
	        data = first.getInfo();
	        first = first.getNext();
	    }
	    return data;
    }
    /*
     * Print all list
     */
    public void print(){
	    Node<E> current = first;
	    
	    while (current != null){
	        System.out.print(current.getInfo() + " ");
	        current = current.getNext();
	    }
	    System.out.println();
    }
}