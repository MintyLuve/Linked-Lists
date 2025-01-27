package InsertSortedElements;

public class MyLinkedList<E extends Comparable<E>>{
    // Notice that stating E extends Comparable<E> is needed, as we should use
    // compareTo for inserting in a sorted way
    private Node<E> first;
    
    public MyLinkedList(){
	    this.first = null;
    }
    
    /*
     * Insertion at the beginning
     * Change this method to insert the values in a sorted way
     */
    public void insert(E info){
        // Gets the new node
	    Node<E> newNode = new Node<E>(info);
        //prints out current list
        print();
        // if the list doesn't exist, or if the info is less then the first value
        if(first == null || info.compareTo(first.getInfo()) < 0){
            // first (new node) --> old first
            newNode.setNext(first);
            first = newNode;
        }
        else {
            //current node to use to go through the list
            Node<E> currentNode = first;
            
            //while there is a next node in the list
            while (currentNode.getNext() != null){
                //if the info is greater then the current info, but smaller then the next info
                if (info.compareTo(currentNode.getInfo()) > 0 && info.compareTo(currentNode.getNext().getInfo()) <= 0){
                    // current node --> new node --> next node
                    newNode.setNext(currentNode.getNext());
                    currentNode.setNext(newNode);
                    break;
                }
                else{
                    // moves onto the next node in the list
                    currentNode = currentNode.getNext();
                }
            }  
            // if the new node was not smaller then the last node 
            if (currentNode.getNext() == null) {
                // becomes the last node
                // current --> new node
                currentNode.setNext(newNode);
            }
        }
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