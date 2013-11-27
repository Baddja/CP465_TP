import java.util.ArrayList;


public class Apriori_Control {
	
	public static void main(String[] args){
		L_List l = new L_List();
		C_List c = new C_List();
		
		C_Builder CB = new C_Builder();
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("A");
		l.add_item(test, 0.00f);
		test = new ArrayList<String>();
		test.add("B");
		l.add_item(test, 0.00f);
		test = new ArrayList<String>();
		test.add("C");
		l.add_item(test, 0.00f);
		test = new ArrayList<String>();
		test.add("D");
		l.add_item(test, 0.00f);
		test = new ArrayList<String>();
		
		l.print_Ln(1);
		
		//CB.build_Cn(2, l, c);
		
	}
}
