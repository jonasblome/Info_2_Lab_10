import java.util.ArrayList;

/**
 * This class recreates the behavior of a Set.
 * Also calculates different subsets of given Sets.
 * 
 * @author 	jonasblome
 * @author	n-c0de-r
 * @version	17.06.21
 */

public class Set<type>{
	
	private ArrayList<type> set;
	
	/**
	 * Constructor for the Set class.
	 */
	public Set() {
		set = new ArrayList<>();
	}
	
	// Basic data methods start here
	
	/**
	 * Setter method for Set.
	 * 
	 * @param e	Adding an element to the Set.
	 */
	public void add(type e) {
		if (!contains(e)) {
			set.add(e);
		} else {
			return;
		}
	}
	
	/**
	 * Getter method, checking if an element is already in the Set.
	 * 
	 * @param e	Element to be inserted into the Set.
	 * @return	True if the element is already in the Set.
	 */
	public boolean contains(type e) {
		if (set.contains(e)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Getter method, returning element at a position.
	 * 
	 * @param i	Index number to get the element at.
	 * @return	Return the Object of the given type.
	 */
	public type get(int i) {
		return set.get(i);
	}
	
	/**
	 * Getter method for number of elements in the Set
	 * 
	 * @return	Integer number of elements.
	 */
	public int length() {
		return set.size();
	}	
	
	/**
	 * Setter method to remove an element from the Set.
	 * 
	 * @param e	Element to be removed from the Set.
	 */
	public void remove(type e) {
		if (contains(e)) {
			int i = set.indexOf(e);
			set.remove(i);
		} else {
			return;
		}
	}
	
	/**
	 * Convert all element as a String
	 * 
	 * @return	Resulting String of elements in curly braces
	 */
	public String toString() {
		String res = "{ ";
		for (type t : set) {
			res += t + ", ";
		}
		// Remove the last instance of ', ' adding closing parentheses
		res = res.substring(0, res.length()-2) + " }";
		return res;
	}
	
	//Calculation methods start here
	
	/**
	 * Setter method, unite two given Sets together.
	 * 
	 * @param sub	The second Set to merge with the main one.
	 * @return	Resulting Set, combination of both.
	 */
	public Set<type> union(Set<type> sub) {
		Set<type> res = this;
		
		for (int i = 0; i<sub.length(); i++) {
			if (!contains(sub.get(i))) {
				res.add(sub.get(i));
			}
		}
		return res;
	}
	
	/**
	 * Setter method, create in intersection of two Sets.
	 * 
	 * @param sub	The second Set to find the intersection with the main one.
	 * @return	Resulting Set, intersection of both.
	 */
	public Set<type> intersection(Set<type> sub) {
		Set<type> res = this;
		
//		for (int i = 0; i<sub.length(); i++) {
//			if (!contains(sub.get(i))) {
//				res.add(sub.get(i));
//			}
//		}
		return res;
	}
	
	/**
	 * Setter method, create in subtraction of two Sets.
	 * 
	 * @param sub	The second Set to subtract from the main one.
	 * @return	Resulting Set, subtraction of both.
	 */
	public Set<type> subtraction(Set<type> sub) {
		Set<type> res = this;
		
//		for (int i = 0; i<sub.length(); i++) {
//			if (!contains(sub.get(i))) {
//				res.add(sub.get(i));
//			}
//		}
		return res;
	}
	
	/**
	 * Setter method, create a power Set of two given Sets.
	 * 
	 * @param sub	The second Set to combine with the main one.
	 * @return	Resulting Set, permutation of both.
	 */
	public Set<type> powerset(Set<type> sub) {
		Set<type> res = this;
		
//		for (int i = 0; i<sub.length(); i++) {
//			if (!contains(sub.get(i))) {
//				res.add(sub.get(i));
//			}
//		}
		return res;
	}
}
