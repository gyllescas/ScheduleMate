
public class testing {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		Worker[] list = new Worker[5];
		String[] Gabriel = {"Tuesday","Wednesday","Thursday"};
		String[] Alberto = {"Tuesday","Thursday"};
		String[] Larissa = {"Monday","Wednesday","Thursday"};
		String[] Jose ={"Thursday"};
		String[] Jasmine= {};
		String[] gabePositions = {"tortilla","prep","salsa","grill"};
		String[] albertoPositions = {"tortilla","prep","salsa","grill"};
		String[] larissaPositions = {"tortilla","prep","salsa","grill"};
		String[] josePositions = {"tortilla","prep","salsa","grill"};
		String[] jasminePositions= {"tortilla","prep","salsa","grill"};
		
		list[0] = new Worker("Gabriel", Gabriel,gabePositions );
		
		
		list[1] = new Worker("Alberto", Alberto,gabePositions );
		
		list[2] = new Worker("Larissa",Larissa,gabePositions );
		
		list[3] = new Worker("Jose",Jose,gabePositions );
		
		list[4] = new Worker("Jasmine",Jasmine,gabePositions );
		

		
		OptimizeWeek week1 = new OptimizeWeek(list);
		week1.optimize();
		
		
		
	}

}
