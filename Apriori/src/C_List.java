import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C_List {
	private Map<ArrayList<String>,Integer> items = new HashMap<ArrayList<String>,Integer>();
	
	public C_List() {
		
	}
	
	public void add_item(ArrayList<String> item, int c){
		items.put(item, c);
	}

	public HashMap<ArrayList<String>, Integer> get_map(){
		return new HashMap<ArrayList<String>, Integer>(items);
	}
	
	public void print_C(){
		System.out.println("C : " + this.items.toString());
	}
	
	public void  clear(){
		items.clear();
	}
}