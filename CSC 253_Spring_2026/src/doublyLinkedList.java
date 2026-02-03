
public class doublyLinkedList {
	//Main Container 
    private Node head;
    private Node tail;
    public int size;
    
    // Inner Node class
    private class Node {
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public void addHead(int data) {
        Node newNode = new Node(data);  // Create new node
       
        /* Must check for whether its empty, otherwise head and tail can't be compared against. */ 
    	if ( head == null) {
    		head = newNode;
    		tail = newNode;
    	}else {
    	head.prev = newNode;
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
	newNode.prev = tail;
	tail = newNode;
}
size++;
    	}
    
    //Method to remove head from the beginning 
   public void removeHead(int data) {
	   if (head == null) {
		   System.out.println("List is empty.");
		   return;

	   }
	   head = head.next;
	   //This helps confirm if the list is empty after the removal
	   if (head !=null) {
		   head.prev = null;
	   }
	   else {
		   tail = null;
	   }
	   size--;
	   
   }
   
   //Changed it to traverse list, I like the wording here more than before 
public void traverseListForward() {
	Node cur = head;
	while (cur!=null) {
		System.out.print(cur.data + " ---> " );
		cur = cur.next;
	}
	System.out.println(" Null.");
    	
    }

public void traverseListBackward() {
	Node cur = tail;
	while (cur!= null) {
		System.out.print(cur.data + " <---" );
		cur = cur.prev;
		
	}
	System.out.println("Done printing backwards!");
}


}