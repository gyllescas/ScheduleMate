import java.util.Scanner;  
public class OptimizeWeek {
	Worker[] crew;
	String[] dayName = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};
	Worker[] monday;
	Worker[] tuesday;
	Worker[] wednesday;
	Worker[] thursday;
	Worker[] friday;
	Worker[] saturday;
	Worker[] sunday;
	Worker[][] week = new Worker[][] { monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	public OptimizeWeek(Worker[] crew){
		this.crew= crew;
	}
	public void optimize(){
		Day[] wholeWeek = new Day[7];
		for(int i=0; i<week.length;i++){
			int tortilla,salsa,prep,grill,cashier;
			Scanner sc=new Scanner(System.in);  
			System.out.println("How many Tortilla Crew do you need for " + dayName[i]);
			tortilla= sc.nextInt();
			System.out.println("How many Salsa Crew do you need for " + dayName[i]);
			salsa= sc.nextInt();
			System.out.println("How many Prep Crew do you need for " + dayName[i]);
			prep= sc.nextInt();
			System.out.println("How many Grill Crew do you need for " + dayName[i]);
			grill = sc.nextInt();
			System.out.println("How many Cashier Crew do you need for " + dayName[i]);
			cashier = sc.nextInt();
			wholeWeek[i] = new Day(dayName[i],tortilla,salsa,prep,grill,cashier,this.crew);
			 wholeWeek[i].optimize();
			
			}
			
		for(int i=0; i<week.length;i++){
			System.out.println("Recommended Crew for "+dayName[i]+":");
			System.out.println("Grill:");
			for(int j=0; j<wholeWeek[i].recommendedGrill.size();j++){
				Worker w = wholeWeek[i].recommendedGrill.get(j);
				System.out.println("	" +w.name);
			}
			System.out.println("Prep:");
			for(int j=0; j<wholeWeek[i].recommendedPrep.size();j++){
				Worker w = wholeWeek[i].recommendedPrep.get(j);
				System.out.println("	" +w.name);
			}
			System.out.println("Salsa:");
			for(int j=0; j<wholeWeek[i].recommendedSalsa.size();j++){
				Worker w = wholeWeek[i].recommendedSalsa.get(j);
				System.out.println("	" +w.name);
			}
			System.out.println("Tortilla:");
			for(int j=0; j<wholeWeek[i].recommendedTortilla.size();j++){
				Worker w = wholeWeek[i].recommendedTortilla.get(j);
				System.out.println("	" +w.name);
			}
		}
		}
	}

