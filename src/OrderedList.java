

public class OrderedList {
	 private class  Node{
		 Worker worker;
		 Node next;
		 Node( Worker w ,Node n){
			 worker =w;
			 next = n;
		 }
		 
	 }
	 private Node head = new Node(null, null);
	 public void insert(Worker w){
		 Node begin = head;
		 for(Node next = head.next; next!=null; next=next.next){
			 if(w.totalAvailableDays <next.worker.totalAvailableDays){
				 begin.next = new Node(w,begin.next);
			 }
			 begin = begin.next;
		 }
		 begin.next = new Node(w,begin.next);
	 }
	
}
