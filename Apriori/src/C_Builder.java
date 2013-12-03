import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class C_Builder {
	public C_Builder(){}
	
	public void build_Cn(int n, L_List L, C_List C){
		C.clear();
		
		HashMap<HashSet<String>, Float> L1 = L.get_Ln(1);
		HashMap<HashSet<String>, Float> Lnm1 = L.get_Ln(n-1);
		
		for(HashSet<String> item_Lnm1 : Lnm1.keySet()){
			for(HashSet<String> item_L1 : L1.keySet()){				
				if(item_Lnm1.containsAll(item_L1) == false){
					ArrayList<String> candidate = new ArrayList<String>();
					candidate.addAll(item_Lnm1);
					candidate.addAll(item_L1);
	
					C.add_item(candidate, 0);
				}
			}
		}
	}
}
