
import java.util.ArrayList;
import java.util.List;

public class Calculator extends PeriodicTable {
	
	public static List<String> formulaArrList = new ArrayList<String>(); //Sorted array, ("Fe", "2", "Mg", "3")
	
	
	
	public void seperateFormula (String formula) {
		
		String s;
		
		for (int i = 0; i < formula.length(); i++) {
			s = String.valueOf(formula.charAt(i));
			try {
				Integer subscript = Integer.parseInt(s);
		    } catch (NumberFormatException e) { 
		    	
		    }	
		}
        
	}
	
}
