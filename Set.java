import java.util.ArrayList;

/**
 * This class recreates the behavior of a Set.
 * 
 * @author 	jonasblome
 * @author	n-c0de-r
 * @version	17.06.21
 */

public class Set<type>{
	
	private ArrayList<type> set;
	
	public Set() {
		set = new ArrayList<>();
	}
	
	public void add(type e) {
		if (!contains(e)) {
			set.add(e);
		} else {
			return;
		}
	}
	
	public boolean contains(type e) {
		if (set.contains(e)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void remove(type e) {
		if (contains(e)) {
			int i = set.indexOf(e);
			set.remove(i);
		} else {
			return;
		}
	}
	
	public int length() {
		return set.size();
	}
	
	public String toString() {
		String res = "";
		for (type t : set) {
			res += ", " + t;
		}
		return res;
	}
	
	public type get(int i) {
		return set.get(i);
	}
	
	public Set<type> union(Set<type> sub) {
		Set<type> res = this;
		
		for (int i = 0; i<sub.length(); i++) {
			if (!contains(sub.get(i))) {
				res.add(sub.get(i));
			}
		}
		return res;
	}
}
