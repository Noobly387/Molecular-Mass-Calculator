import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PeriodicTable extends Element {
	
	static File inputFile = new File("src/PeriodicTable.txt");
	
	private static String elementLine;
	private static String[] elementLineArr;
	
	private static void importTable() throws IOException {

		BufferedReader input = new BufferedReader(new FileReader(inputFile));
		
		elementLine = "";
		
		System.out.println("Loading Resources...");
		
		while ((elementLine = input.readLine()) != null) {
			
			elementLineArr = elementLine.split(" ");
			System.out.println(elementLine);
			Element element = new Element(elementLineArr[0], Double.parseDouble((elementLineArr[1])));
			
			elementList.add(element);
        }
	}
	
	
	public static void loadTable() throws IOException {
		
		Element placeHolder = new Element ("Placeholder", 0);
		
		elementList.add(placeHolder); //adds a placeholder so the element index is correspondent to its atomic number
		
		PeriodicTable.importTable();
		
		
	}
	
}
