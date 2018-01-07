
public class Worker   {
	int totalAvailableDays = 7;
	String[] daysUnavailable;
	//boolean for each day of week initialized to false
	boolean [] availability = new boolean[7];
	
	
	boolean monday= true;
	boolean tuesday=true;
	boolean wednesday=true;
	boolean thursday=true;
	boolean friday=true;
	boolean saturday=true;
	boolean sunday=true;
	String name;
	int totalDaysWorked;
	boolean salsa, tortilla, prep, grill,cashier;
	public Worker(String name,  String[] daysUnavailable, String[]positionsKnown){
		this.daysUnavailable = daysUnavailable;
		this.name = name;
		this.totalDaysWorked=0;
		//we initially made everyday available so this function updates 
		//to reflect 'daysUnavailable'
		days(daysUnavailable);
		//update the positions known for this worker
		addPosition(positionsKnown);
		
		
	}
	private void addPosition(String[] position){
		for(int i=0; i< position.length;i++){
			if(position[i] == "salsa" || position[i] =="Salsa"){
				this.salsa=true;
				}
			if(position[i] == "tortilla" || position[i] =="Tortilla"){
				this.tortilla=true;
				}
			if(position[i] == "prep" || position[i] =="Prep"){ 
				this.prep=true;
				}
			if(position[i] == "grill" || position[i] =="Grill"){
				this.grill=true;
				}
			if(position[i] == "cashier" || position[i] =="Cashier"){
				this.cashier=true;
				}
		}
		
	}
	
	public void days(String[] names){
		
		for(int i=0; i<names.length;i++){
			String day = names[i];
			if(day.contains("Monday")){
				monday=false;
				totalAvailableDays--;
			}
			if(day.contains("Tuesday")){
				tuesday=false;
				totalAvailableDays--;
			}
			if(day.contains("Wednesday")){
				wednesday=false;
				totalAvailableDays--;
			}
			if(day.contains("Thursday")){
				thursday=false;
				totalAvailableDays--;
			}
			if(day.contains("Friday")){
				friday=false;
				totalAvailableDays--;
			}
			if(day.contains("Saturday")){
				saturday=false;
				totalAvailableDays--;
			}
			if(day.contains("Sunday")){
				sunday=false;
				totalAvailableDays--;
			}
		}
	}
	
	
}
