package ListWithHeadAndTail;

public class MyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    
    public MyLinkedList(){
	    this.head = null;
	    this.tail = null;
    }
    
    //Insertion at the beginning
    public void insert(E info){
	    Node<E> newNode = new Node<E>(info);
        // head (new node) --> old head
	    newNode.setNext(head);
	    head = newNode;
        // if there is no tail sets it to new node
	    if (tail == null){
	        tail = newNode;
	    }
    }

    // Insertion at the end 
    public void insertEnd(E info){
	    Node<E> newNode = new Node<E>(info);
        // old tail --> tail (new node)
	    tail.setNext(newNode);
	    tail = newNode;
        // if there is no head sets it to new node
	    if (head == null){
	        head = newNode;
	    }

    }
    
    //Extraction of the first node
    public E extract(){
        E data = null;
        // If the head exists
        if (head != null) {
            // Return the info then move the head up one
            data = head.getInfo();
            head = head.getNext();
        }
        return data;
    }

    //Extraction of the last node
    public E extractEnd(){
	    E data = null;
        // if the tail exists
        if (tail != null) {
            // Return the data
            data = tail.getInfo();
            // if there is only one node, it deletes it and returns data
            if (head == tail){
                head = null;
                tail = null;
                return data;
            }
            // Getting the second to last node
            Node<E> prev = head;
            while (prev.getNext().getNext() != null){
                prev = prev.getNext();
            }
            // Moves the tail back one
            tail = prev;
            tail.setNext(null);
        }
        return data;
    }

    //Print all list
    public void print(){
	    Node<E> current = head;
	    
	    while (current != null){
	        System.out.print(current.getInfo() + " ");
	        current = current.getNext();
	    }
	    System.out.println();
    }
}
