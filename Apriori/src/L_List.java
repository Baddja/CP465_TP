
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class L_List {
	private Map<Integer, HashMap<HashSet<String>, Float>> items = new HashMap<Integer, HashMap<HashSet<String>, Float>>();
	
	public L_List(){
		this.next_level();	
	}
	
	/*
	 * next_L: 
	 * 
	 * Creates an empty hashmap for the next Ln+1
	 */
	public void next_level(){
		System.out.println("Adding a level for L(" + (items.size()+1) + ")");
		this.items.put(items.size()+1, new HashMap<HashSet<String>, Float>());
	}
	
	/*
	 * add_item: item , s
	 * item - the set of elements that make up an item
	 * s - the support 
	 * 
	 * Adds an item of length n to the hashmap for Ln
	 */
	public void add_item(HashSet<String> i, Float s){
		HashSet<String> item = new HashSet<String>();
		item.addAll(i);
		System.out.println("Adding " + item.toString() + " to L(" + item.size() + ")");
		this.items.get(item.size()).put(item, s);
	}
	
	/*
	 * get_L: int level : Hashmap<Item, Support>
	 * level - the level of L to be retrieved
	 * 
	 * Returns the hashmap containing items in Ln where n is level
	 */
	public HashMap<HashSet<String>, Float> get_Ln(int level){
		System.out.println("Geting L(" + level + ")");
		return this.items.get(level);
	}
	
	public void print_Ln(int level){
		System.out.println("L("+level+") : " + this.items.get(level).toString());
	}
}