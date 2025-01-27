package DoublyLinkedList;

public class MyDoublyLinkedList<E extends Comparable<E>>{
    private Node<E> head;
    private Node<E> tail;
    
    public MyDoublyLinkedList(){
	    this.head = null;
        this.tail = null;
    }
    
    // Insertion at the beginning
    public void insertBeginning(E info){
	    Node<E> newNode = new Node<E>(info);
	    newNode.setNext(head);
	    if (head != null){
	        head.setPrev(newNode);
	    }
	    head = newNode;
	    if (tail == null){
	        tail = newNode;
	    }
    }
    
    // Insertion at the end
    public void insertEnd(E info){
	    Node<E> newNode = new Node<E>(info);
	    if (tail == null){
            head = newNode;
	        tail = newNode;
	    }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
	        tail = newNode;
	   }
    }
    
    // Extraction of the first node
    public E extractBeginning(){
	    E data = null;
	    if (head != null && head.getNext() != null){
            data = head.getInfo();
            head = head.getNext();
            head.setPrev(null);
        }
        else if (head != null){
            data = head.getInfo();
            head = null;
            tail = null;
        }
	    return data;
    }

    // Extraction of the last node
    public E extractEnd(){
	    E data = null;
	    if (tail != null && tail.getPrev() != null){
            data = tail.getInfo();
            tail = tail.getPrev();
            tail.setNext(null);
        }
        else if (tail != null){
            data = tail.getInfo();
            tail = null;
            head = null;
        }
	    return data;
    }

    /* Delete all nodes with info equal to value
     * returns number of deleted nodes */ 
     public int deleteAll(E info){
        int deleted = 0;
        Node<E> current = head;
        // If no list exists
        if(head == null && tail == null){
            return deleted;
        }
        else {
            while (current != null) {
                Node<E> prev = current.getPrev();
                Node<E> next = current.getNext();
                // If there is only one node and that should be deleted
                if (head == tail && info == current.getInfo()){
                    // Deletes head + tail
                    head = null;
                    tail = null;
                    // Increments the amount of times it was deleted
                    deleted++;
                }
                // If the head is the data that should be deleted
                else if (current == head && info == current.getInfo()){
                    // null (old head) <-- head
                    next.setPrev(null);
                    head = next;
                    // Increments the amount of times it was deleted
                    deleted++;
                }
                // If the tail is the data that should be deleted
                else if (current == tail && info == current.getInfo()){
                    // tail --> null (old tail)
                    prev.setNext(null);
                    tail = prev;
                    // Increments the amount of times it was deleted
                    deleted++;
                }
                // If a node (that isn't head or tail) should be deleted
                else if (info == current.getInfo()){
                    // prev <--> next (deletes current)
                    prev.setNext(next);
                    next.setPrev(prev);
                    // Increments the amount of times it was deleted
                    deleted++;
                }
                 
                current = current.getNext();
            }
        }
        
        return deleted;
     }
     
    // Print all list forward
    public void printForward(){
	    Node<E> current = head;
	    System.out.print("[ ");
	    while (current != null){
	        System.out.print(current.getInfo() + " ");
	        current = current.getNext();
	    }
	    System.out.println("]");
    }

    // Print all list backwards
    public void printBackwards(){
	    Node<E> current = tail;
        System.out.print("[ ");
	    while (current != null){
	        System.out.print(current.getInfo() + " ");
	        current = current.getPrev();
	    }
	    System.out.println("]");
    }
}
