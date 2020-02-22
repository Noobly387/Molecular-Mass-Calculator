
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Element {
	
	static List<Element> elementList = new ArrayList<Element>();
	
	private String symbol;
	private double mass;
	
	public Element () {}	
		
	public Element (String symbol, double amu) {
		this.symbol = symbol;
		this.mass = amu;
	}
	
	public String getSymbol () {
		return this.symbol;
	}
	
	public double getMass () {
		return this.mass;
	}
	
	
	public static void main(String[] args) throws IOException {
	
		PeriodicTable.loadTable();
		
		System.out.print(elementList.get(10).getSymbol());
		System.out.println(elementList.get(10).getMass());
			
			
			

	}
	
}
