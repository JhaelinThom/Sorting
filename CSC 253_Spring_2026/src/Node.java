public class Node {
	private String name; //The data in the node
	 Node next; //The next address to the next node

public Node (String s, Node n) {
	name = s;
	next = n;
}
public String getName() {
	return name;
}
public void setName(String s) {
	name = s;
}
public void setNext(Node n) {
	next = n;
}

}
