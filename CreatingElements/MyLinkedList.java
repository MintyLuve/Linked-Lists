package CreatingElements;

public class MyLinkedList<E>{
    private Node<E> first;
    
    public MyLinkedList(){
	    this.first = null;
    }
    
    //Insertion at the beginning
    public void insert(E info){
	    Node<E> newNode = new Node<E>(info);
	    newNode.setNext(first);
	    first = newNode;
    }
    
    //Insertion at the end
    public void insertEnd(E info){
        if(first == null) {
    	    Node<E> newNode = new Node<E>(info);
    	    newNode.setNext(first);
    	    first = newNode;                                                
        }
        else{
            Node<E> newNode = new Node<E>(info);
            Node<E> current = first;

            // Goes through the list to set current to the last note
            while (current.getNext() != null){
                current = current.getNext();
            }

        	//Sets the next node to be the last node
        	current.setNext(newNode);
        }
    }

    //Extraction of the first node
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
	    System.out.println("\n--");
    }
}
