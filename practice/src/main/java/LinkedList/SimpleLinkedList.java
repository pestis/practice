package main.java.LinkedList;

public class SimpleLinkedList {
	public Node head;
	public Node dummy;
	
	SimpleLinkedList(){
		
		dummy = new Node();
		dummy.data="dummy";
		dummy.next=null;
		head=dummy;
		
	}
	
	public boolean addNode(String data){
		Node n = new Node();	
		n.data=data;
		n.next=head.next;
		head.next=n;
		return true;
	}
	
	public boolean deleteNode(String data){
		Node p;
		Node q;
		q=head;
		p=head.next;
		
		//Traverse list until we find the node which contains the data that matches what we want to delete.
		while(p!=null && !p.data.equalsIgnoreCase(data)){
			q=p;
			p=p.next;
		}
		
		//Delete the node
		q.next=p.next;
		return true;
	}
	
	public static void printLinkedList(SimpleLinkedList ll){
		Node p;
		p=ll.head.next;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	public int length(){
		Node p;
		int size = 0;
		p=this.head.next;
		while(p!=null){
			size++;
			p=p.next;
		}
		return size;
	}
	
	public String[] getLinkedList(SimpleLinkedList ll){
		String[] str = new String[ll.length()];
		Node p;
		p=this.head.next;
		int idx = 0;
		while(p!=null){
			str[idx]=p.data;
			idx++;
			p=p.next;
		}
		
		return str;
	}
	
	
	public static void main(String args[]){
		
		SimpleLinkedList ll = new SimpleLinkedList();
		ll.addNode("a");
		ll.addNode("b");
		ll.addNode("c");
		printLinkedList(ll);
		System.out.println(ll.length());
		System.out.println("delete a node example");
		ll.deleteNode("b");
		printLinkedList(ll);
		System.out.println(ll.length());
		System.out.println("print LinkedList after converted to String array example");
		String[] arr = ll.getLinkedList(ll);
		
		for(int x = 0; x<arr.length; x++){
			System.out.println(arr[x]);
		}

	}
	
	
}
