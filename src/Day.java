import java.util.*;




public class Day {
	String dayOfWeek;
	int tortilla, salsa, prep,grill,cashier;
	    LinkedList<Worker> listOfWorkers = new LinkedList<Worker>(); //list of recommended workers
	    LinkedList<Worker> recommendedGrill = new LinkedList<Worker>();
	    LinkedList<Worker> recommendedPrep = new LinkedList<Worker>();
	    LinkedList<Worker> recommendedSalsa = new LinkedList<Worker>();
	    LinkedList<Worker> recommendedTortilla = new LinkedList<Worker>();
	    LinkedList<Worker> recommendedCashier = new LinkedList<Worker>();
	   Worker[] allWorkers;
	   int workersNeeded;
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
	public Day(String name,int tortilla,int salsa,int prep,int grill,int cashier,Worker[] allWorkers){
		dayOfWeek = name;
		this.allWorkers = allWorkers;
		//this.workersNeeded = workersNeeded;
		this.tortilla = tortilla;
		this.salsa = salsa;
		this.prep =prep;
		this.grill = grill;
		this.cashier = cashier;
		
	}
	private void getAvailableWorkers(){
		//create a linked list of available workers 
		if (dayOfWeek =="Monday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].monday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Tuesday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].tuesday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Wednesday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].wednesday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Thursday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].thursday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Friday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].friday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Saturday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].saturday==true){
					insert(allWorkers[i]);
				}
			}
		}
		else if(dayOfWeek == "Sunday"){
			for(int i=0; i< allWorkers.length;i++){
				if(allWorkers[i].sunday==true){
					insert(allWorkers[i]);
				}
			}
		}
	}
	public void  optimize(){
		//compile list of all available workers
		getAvailableWorkers();
		//get recomended grill workers first, this is the hardest position in the store
		getGrill();
		getPrep();
		getSalsa();
		getTortilla();
		getCashier();
	//now make the optimal list
//		Node begin =head;
//	for(int i=0; i<workersNeeded && begin.next!=null;i++){
//		
//		if(begin.next!=null){
//			Worker w = begin.next.worker;
//			if(w.totalAvailableDays >0 && w.totalDaysWorked<5){
//				w.totalAvailableDays--;
//				w.totalDaysWorked++;
//				listOfWorkers.add(w);
//			}
//		}
//		begin=begin.next;
//	}
//	//convert to array
//	int arraySize= listOfWorkers.size();
//	Worker[] array = new Worker[arraySize];
//	
//	for(int j = 0; j<arraySize;j++){
//		array[j] = listOfWorkers.get(j);
//	}
//	return array;
	}
	
	private void getGrill(){
		Node cur = head.next;
		Node prev=head;
		for(int i=0; cur!=null && i<this.grill;i++ ){
			if(cur.worker.grill && cur.worker.totalAvailableDays >0 && cur.worker.totalDaysWorked<5){
				cur.worker.totalAvailableDays--;
				cur.worker.totalDaysWorked++;
				recommendedGrill.add(cur.worker);
				//remove the worker from the available pool
				prev.next=cur.next;
				
			}
			cur=cur.next;
			prev=prev.next;
		}
		
	}
	private void getPrep(){
		Node cur = head.next;
		Node prev=head;
		for(int i=0; cur!=null && i<this.prep;i++ ){
			if(cur.worker.prep && cur.worker.totalAvailableDays >0 && cur.worker.totalDaysWorked<5){
				cur.worker.totalAvailableDays--;
				cur.worker.totalDaysWorked++;
				recommendedPrep.add(cur.worker);
				//remove the worker from the available pool
				prev.next=cur.next;
				
			}
			cur=cur.next;
			prev=prev.next;
		}
		
	}
	private void getSalsa(){
		Node cur = head.next;
		Node prev=head;
		for(int i=0; cur!=null && i<this.salsa;i++ ){
			if(cur.worker.salsa && cur.worker.totalAvailableDays >0 && cur.worker.totalDaysWorked<5){
				cur.worker.totalAvailableDays--;
				cur.worker.totalDaysWorked++;
				recommendedSalsa.add(cur.worker);
				//remove the worker from the available pool
				prev.next=cur.next;
				
			}
			cur=cur.next;
			prev=prev.next;
		}
		
	}
	private void getTortilla(){
		Node cur = head.next;
		Node prev=head;
		for(int i=0; cur!=null && i<this.tortilla;i++ ){
			if(cur.worker.tortilla && cur.worker.totalAvailableDays >0 && cur.worker.totalDaysWorked<5){
				cur.worker.totalAvailableDays--;
				cur.worker.totalDaysWorked++;
				recommendedTortilla.add(cur.worker);
				//remove the worker from the available pool
				prev.next=cur.next;
				
			}
			cur=cur.next;
			prev=prev.next;
		}
	}
	private void getCashier(){
		Node cur = head.next;
		Node prev=head;
		for(int i=0; cur!=null && i<this.cashier;i++ ){
			if(cur.worker.cashier && cur.worker.totalAvailableDays >0 && cur.worker.totalDaysWorked<5){
				cur.worker.totalAvailableDays--;
				cur.worker.totalDaysWorked++;
				recommendedCashier.add(cur.worker);
				//remove the worker from the available pool
				prev.next=cur.next;
				
			}
			cur=cur.next;
			prev=prev.next;
		}
	}
}
