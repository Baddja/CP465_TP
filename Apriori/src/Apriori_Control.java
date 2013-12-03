
import java.util.HashSet;
import java.util.List;


public class Apriori_Control {
	
	public static void main(String[] args){
		L_List l = new L_List();
		C_List c = new C_List();
		
		C_Builder CB = new C_Builder();
		
		HashSet<String> test = new HashSet<String>();
		test.add("A");
		l.add_item(test, 0.00f);
		test.clear();
		test.add("B");
		l.add_item(test, 0.00f);
		test.clear();
		test.add("C");
		l.add_item(test, 0.00f);
		test.clear();
		test.add("D");
		l.add_item(test, 0.00f);
		test.clear();
		
		l.print_Ln(1);
		
		CB.build_Cn(2, l, c);
		
		c.print_C();
		
		
		// Below is an example of how to use the FileHandler class to read one line at a time
		// See FileHandler javadoc for more info
		
//		FileHandler fh = new FileHandler("./resources/test.txt", ',', false);
//		List<String> line;
//		while ((line=fh.getNextLine()) != null) {
//			for(String s: line) {
//				System.out.print(s+",");
//			}
//			System.out.println("\n");
//		}
//		fh.dispose();
	}
}
