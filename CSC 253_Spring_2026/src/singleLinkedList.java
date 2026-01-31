
public class singleLinkedList {
	//Main Container 
    private Node head;
    private Node tail;
    public int size;
    
    // Inner Node class
    private class Node {
        int data;
        Node cur;
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
    
    //Method to remove head from the beginning 
   public void removeHead(int data) {
	   if (head == null) {
		   System.out.println("List is empty.");
	   }
	   head = head.next; //Didn't realize this was so simple 

   }
   
   //Changed it to traverse list, I like the wording here more than before 
public void traverseList() {
	Node cur = head;
	while (cur!=null) {
		System.out.print(cur.data + " ---> " );
		cur = cur.next;
	}
	System.out.println(" END.");
    	
    }
}