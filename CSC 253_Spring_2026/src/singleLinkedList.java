
public class singleLinkedList {
    private Node head;
    private Node tail;
    public int size;
    
    // Inner Node class
    private class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void addHead(int data) {
        Node newNode = new Node(data);  // Create new node
       
        /* Must check for whether its empty, otherwise head and tail can't be compared against. */ 
    	if ( head == null) {
    		head = newNode;
    		tail = newNode;
    	}else {
    		
        newNode.next = head;             // Point it to current head
        head = newNode;                  // Make it the new head
    }
        size++;

    }
    public void addLast(int data) {
    	Node newNode = new Node(data);
    	
if (head == null) {
	head = newNode;
	tail = newNode;
}
else {
	tail.next = newNode;
	tail = newNode;
}
size++;
    	
    	}
    
    public void display() {
    	Node temp = head;
    	while (temp!=null) {
    		System.out.print(temp.data + " --> " );
    		temp = temp.next;
    		
    	}
    	System.out.println("END.");
    	
    }
}